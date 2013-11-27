package de.raptor2101.BattleWorldsKronos.Connector.Gui.Controls;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import de.raptor2101.BattleWorldsKronos.Connector.Data.Entities.Game;
import de.raptor2101.BattleWorldsKronos.Connector.Data.Entities.Player;
import de.raptor2101.BattleWorldsKronos.Connector.Gui.IGameView;
import de.raptor2101.BattleWorldsKronos.Connector.Gui.R;

public class GameView extends LinearLayout implements IGameView {
    
  private SimpleDateFormat mFormater;
  
  public GameView(Context context) {
    super(context);
    mFormater = new SimpleDateFormat(context.getString(R.string.date_format_string),Locale.getDefault());
    LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    inflater.inflate(R.layout.game_info_view, this);
  }

  public void setGame(Game gameInfo) {
    Game.State state = gameInfo.getState();

    TextView textView = (TextView) this.findViewById(R.id.text_game_info_view_Title);
    textView.setText(gameInfo.getGameName());

    textView = (TextView) this.findViewById(R.id.text_game_info_view_State);
    textView.setText(state.getResourceId());
    textView.setTextColor(state.getColor(this.getContext()));
    
    textView = (TextView) this.findViewById(R.id.text_game_info_view_Round);
    textView.setText(String.format("%d", gameInfo.getCurrentRound()));
    
    textView = (TextView) this.findViewById(R.id.text_game_info_view_Date);
    textView.setText(mFormater.format(gameInfo.getUpdateDate()));
    
    LinearLayout layout = (LinearLayout) findViewById(R.id.layout_game_info_view_PlayerInfo);
    layout.removeAllViews();
    List<Player> players = gameInfo.getPlayers();
    
    textView = (TextView) this.findViewById(R.id.text_game_info_view_PlayerCount);
    textView.setText(String.format("%d", players.size()));
    
    for (int i=0;i<players.size();i++){
      PlayerView view = new PlayerView(getContext());
      view.setPlayerInfo(players.get(i));
      layout.addView(view);
    }
  }

}
