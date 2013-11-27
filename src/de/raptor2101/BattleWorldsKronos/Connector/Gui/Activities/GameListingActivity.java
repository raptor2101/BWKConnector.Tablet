package de.raptor2101.BattleWorldsKronos.Connector.Gui.Activities;

import java.util.List;

import android.content.Intent;
import android.widget.ListAdapter;
import de.raptor2101.BattleWorldsKronos.Connector.Data.Entities.Game;
import de.raptor2101.BattleWorldsKronos.Connector.Gui.GameViewAdapater;
import de.raptor2101.BattleWorldsKronos.Connector.Gui.R;

public class GameListingActivity extends AbstractGameListingActivity{
  private GameViewAdapater mAdapter = new GameViewAdapater(this);
  
  public GameListingActivity() {
    super(R.layout.game_listing_activity);
  }

  

  @Override
  protected void startSettingsActivity() {
    Intent intent = new Intent(this, SettingsActivity.class);
    startActivity(intent);
  }



  @Override
  protected ListAdapter getGamesAdapter() {
    return mAdapter;
  }



  @Override
  protected void setGames(List<Game> games) {
    mAdapter.setGames(games);
    
  }
  
}
