package de.raptor2101.BattleWorldsKronos.Connector.Gui.Activities;

import java.util.List;

import android.content.Intent;
import android.widget.ListAdapter;
import de.raptor2101.BattleWorldsKronos.Connector.Gui.GameInfoAdapater;
import de.raptor2101.BattleWorldsKronos.Connector.Gui.R;
import de.raptor2101.BattleWorldsKronos.Connector.JSON.GameInfo;

public class GameListingActivity extends AbstractGameListingActivity{
  private GameInfoAdapater mAdapter = new GameInfoAdapater(this);
  
  public GameListingActivity() {
    super(R.layout.game_listing_activity);
  }

  

  @Override
  protected void startSettingsActivity() {
    Intent intent = new Intent(this, SettingsActivity.class);
    startActivity(intent);
  }

  @Override
  protected ListAdapter getGameInfoAdapter() {
    return mAdapter;
  }

  @Override
  protected void setGameInfos(List<GameInfo> games) {
    mAdapter.setGameInfos(games);
  }
  
}
