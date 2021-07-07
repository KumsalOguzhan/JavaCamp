package com.company.concrete;

import com.company.abstracts.BaseGamerManager;
import com.company.abstracts.GamerCheckService;
import com.company.entities.Gamer;

public class GamerManager extends BaseGamerManager {
    GamerCheckManager gamerCheckManager = new GamerCheckManager();

    @Override
    public void register(Gamer gamer) throws Exception {
        if (gamerCheckManager.checkIfRealGamer(gamer)){
            super.register(gamer);
        }else {
            throw new Exception("Not a valid gamer");
        }
    }
}
