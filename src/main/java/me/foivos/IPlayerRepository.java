package me.foivos;

import java.util.UUID;

public interface IPlayerRepository {

    PlayerData getPlayerDataById(UUID id);

}
