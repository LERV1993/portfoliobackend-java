package com.portfolio.backend.service;

import com.portfolio.backend.model.Banner;
import com.portfolio.backend.repository.BannerRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.backend.exception.ResourceNotFoundException;

@Service
public class BannerServicioImp implements BannerServicio {

    @Autowired
    public BannerRepository bannerRepo;

    @Override
    public List<Banner> verBanner() {
        return bannerRepo.findAll();
    }

    @Override
    public void crearBanner(Banner banner) {
        bannerRepo.save(banner);
    }

    @Override
    public void borrarBanner(Long Id) {
        bannerRepo.deleteById(Id);
    }

    @Override
    public void actualizarBanner(Banner banner, Long Id) {
        Banner nuevoBanner = bannerRepo.findById(Id).orElseThrow(() -> new ResourceNotFoundException("Banner", "Id", Id));
        nuevoBanner.setTitulo1(banner.getTitulo1());
        nuevoBanner.setTitulo2(banner.getTitulo2());
        nuevoBanner.setTitulo3(banner.getTitulo3());
        nuevoBanner.setSubtitulo(banner.getSubtitulo());
        nuevoBanner.setDescripcion1(banner.getDescripcion1());
        nuevoBanner.setDescripcion2(banner.getDescripcion2());
        nuevoBanner.setDescripcion3(banner.getDescripcion3());
        nuevoBanner.setImagen(banner.getImagen());
        nuevoBanner.setPie_foto1(banner.getPie_foto1());
        nuevoBanner.setPie_foto2(banner.getPie_foto2());

        bannerRepo.save(nuevoBanner);
    }

    @Override
    public Banner buscarBannerPorId(Long id) {
        Banner banner = bannerRepo.findById(id).orElse(null);
        return banner;
    }

}
