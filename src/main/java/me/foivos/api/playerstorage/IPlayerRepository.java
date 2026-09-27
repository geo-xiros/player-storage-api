package me.foivos.api.playerstorage;

import java.util.UUID;

public interface IPlayerRepository {

    PlayerData getPlayerDataById(UUID id);

}
