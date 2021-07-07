package com.company.abstracts;

import com.company.entities.Campaign;
import com.company.entities.Game;
import com.company.entities.Gamer;

public interface GamerService {
    void buy(Gamer gamer, Game game, Campaign campaign);
    void register(Gamer gamer) throws Exception;
    void update(Gamer gamer);
    void delete(Gamer gamer);
    void login(Gamer gamer);
}
