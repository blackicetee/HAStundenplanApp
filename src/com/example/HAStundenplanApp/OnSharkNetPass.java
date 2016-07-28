package com.example.HAStundenplanApp;

import net.sharksystem.sharknet.api.SharkNet;

/**
 * Created by Thilo S. on 28.07.2016.
 */
public interface OnSharkNetPass {
    SharkNet getSharkNet();
    void setSharkNet(SharkNet sharkNet);
}
