package com.company.abstracts;

import com.company.entities.Campaign;

public abstract class BaseCampaignManager implements CampaignService{
    @Override
    public void add(Campaign campaign) {
        System.out.println("eklendi : " + campaign.getName());
    }

    @Override
    public void delete(Campaign campaign) {
        System.out.println("silindi : " + campaign.getName());
    }

    @Override
    public void update(Campaign campaign) {
        System.out.println("güncellendi : " + campaign.getName());
    }
}
