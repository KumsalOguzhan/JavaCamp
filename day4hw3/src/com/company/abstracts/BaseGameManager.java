package com.company.abstracts;

import com.company.entities.Game;

public abstract class BaseGameManager implements GameService{
    @Override
    public void add(Game game) {
        System.out.println("eklendi : " + game.getName());
    }

    @Override
    public void delete(Game game) {
        System.out.println("silindi : " + game.getName());
    }

    @Override
    public void update(Game game) {
        System.out.println("güncellendi : " + game.getName());
    }
}
