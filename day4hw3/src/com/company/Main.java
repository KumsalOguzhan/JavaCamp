package com.company;

import com.company.concrete.CampaignManager;
import com.company.concrete.GameManager;
import com.company.concrete.GamerManager;
import com.company.entities.Campaign;
import com.company.entities.Game;
import com.company.entities.Gamer;

public class Main {

    public static void main(String[] args) throws Exception {
        GamerManager gamerManager = new GamerManager();
        GameManager gameManager = new GameManager();
        CampaignManager campaignManager = new CampaignManager();

        gameManager.add(new Game(1, "gta", 150));
        campaignManager.add(new Campaign(10, "summerSale", 10));
        gamerManager.register(new Gamer(100, "emre", "kaya", "54321", 2005));
        gamerManager.buy(new Gamer(101, "ali", "gül", "786298", 2002),
                new Game(2, "payday", 200), new Campaign(11, "wintersale", 20));
    }
}
