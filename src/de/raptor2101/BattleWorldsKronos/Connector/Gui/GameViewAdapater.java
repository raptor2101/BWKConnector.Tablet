package de.raptor2101.BattleWorldsKronos.Connector.Gui;

import android.content.Context;
import de.raptor2101.BattleWorldsKronos.Connector.Gui.Controls.GameView;


public class GameViewAdapater extends AbstractGameViewAdapater {

  public GameViewAdapater(Context context) {
    super(context);
  }

  @Override
  protected IGameView createGameView(Context context) {
    return new GameView(context);
  }
  
  

}
