package com.company.abstracts;

import com.company.entities.Campaign;
import com.company.entities.Game;
import com.company.entities.Gamer;

public abstract class BaseGamerManager implements GamerService{
    @Override
    public void buy(Gamer gamer, Game game, Campaign campaign) {
        double pay = game.getPrice() - (game.getPrice() * campaign.getDiscount() / 100);
        System.out.println("oyun alındı : " + game.getName() + "fiyat : " + pay + " alan kişi : " + gamer.getFirstName());
    }

    @Override
    public void register(Gamer gamer) throws Exception {
        System.out.println("kayıt yapıldı : " + gamer.getFirstName());
    }

    @Override
    public void update(Gamer gamer) {
        System.out.println("oyuncu güncellendi : " + gamer.getFirstName());
    }

    @Override
    public void delete(Gamer gamer) {
        System.out.println("oyuncu silindi : " + gamer.getFirstName());
    }

    @Override
    public void login(Gamer gamer) {
        System.out.println("giriş yapıldı : " + gamer.getFirstName());
    }
}
