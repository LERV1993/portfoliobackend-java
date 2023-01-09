package com.portfolio.backend.controller;

import com.portfolio.backend.model.Banner;
import com.portfolio.backend.service.BannerServicioImp;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BannerControlador {

    @Autowired
    BannerServicioImp bannerServ;

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/new/banner")
    public void crearBanner(@RequestBody Banner banner) {
        bannerServ.crearBanner(banner);
    }

    @GetMapping("/ver/banner")
    @ResponseBody
    public List<Banner> verBanner() {
        return bannerServ.verBanner();
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/modificar/banner/{id}")
    public void modificarBanner(@RequestBody Banner banner, @PathVariable(value = "id") Long bannerId) {
        bannerServ.actualizarBanner(banner, bannerId);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/borrar/banner/{id}")
    public void eliminarBanner(@PathVariable(value = "id") Long Id) {
        bannerServ.borrarBanner(Id);
    }

    @GetMapping("/banner/{id}")
    @ResponseBody
    public Banner buscarBannerPorId(@PathVariable(value = "id") Long Id) {
        return bannerServ.buscarBannerPorId(Id);
    }
}
