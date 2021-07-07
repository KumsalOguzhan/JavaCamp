package com.company.abstracts;

import com.company.entities.Campaign;
import com.company.entities.Game;

public interface GameService {
    void add(Game game);
    void delete(Game game);
    void update(Game game);
}
