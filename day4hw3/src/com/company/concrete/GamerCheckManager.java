package com.company.concrete;

import com.company.abstracts.GamerCheckService;
import com.company.entities.Gamer;

public class GamerCheckManager implements GamerCheckService {
    @Override
    public boolean checkIfRealGamer(Gamer gamer) {

        return true;
    }
}
