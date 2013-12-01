package de.raptor2101.BattleWorldsKronos.Connector.Gui.Activities;

import de.raptor2101.BattleWorldsKronos.Connector.Gui.R;
import android.os.Bundle;

public class GameListingActivity extends ActionBarGameListingActivity{
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    this.setTitle(R.string.title_activity_games);
    super.onCreate(savedInstanceState);
  }
}
