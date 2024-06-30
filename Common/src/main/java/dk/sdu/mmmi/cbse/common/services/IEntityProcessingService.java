package dk.sdu.mmmi.cbse.common.services;

import dk.sdu.mmmi.cbse.common.data.GameData;
import dk.sdu.mmmi.cbse.common.data.World;

/**
 * Provides process method
 */
public interface IEntityProcessingService {

    /**
     * Is tied to gameloop and will run code every game update
     * @param gameData
     * @param world
     */
    void process(GameData gameData, World world);
}