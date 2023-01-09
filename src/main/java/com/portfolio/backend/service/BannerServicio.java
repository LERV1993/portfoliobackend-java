package com.portfolio.backend.service;

import com.portfolio.backend.model.Banner;
import java.util.List;


public interface BannerServicio {
    
    public List<Banner> verBanner();
    
    public void crearBanner(Banner banner);
    
    public void borrarBanner(Long Id);
    
    public void actualizarBanner(Banner banner,Long Id);
    
    public Banner buscarBannerPorId(Long Id);
}
