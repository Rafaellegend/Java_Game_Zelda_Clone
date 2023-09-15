package com.patopunchstudio.graphics;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import com.patopunchstudio.main.Game;

public class UI {

  public void render(Graphics g) {
    g.setFont(new Font("arial", Font.BOLD, 13));
    // Life Bar
    g.setColor(Color.BLACK);
    g.fillRect(20, 20, (Game.player.maxlife / Game.player.maxlife) * 100, 20);
    g.setColor(Color.RED);
    if (Game.player.life > 0 ) {
      g.fillRect(20, 20, (int) ((Game.player.life / Game.player.maxlife) * 100), 20);
    }
    g.setColor(Color.WHITE);
    g.drawString((int) Game.player.life + "/" + Game.player.maxlife, 50, 35);
    // Mana Bar
    g.setColor(Color.BLACK);
    g.fillRect(520, 20, (Game.player.maxmana / Game.player.maxmana) * 100, 20);
    g.setColor(Color.BLUE);
    g.fillRect(520, 20, (int) ((Game.player.mana / Game.player.maxmana) * 100), 20);
    g.setColor(Color.WHITE);
    g.drawString((int) Game.player.mana + "/" + Game.player.maxmana, 550, 35);
  }

}