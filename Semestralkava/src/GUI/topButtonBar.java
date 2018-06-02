/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javafx.scene.control.ToolBar;
import javafx.scene.layout.VBox;
import util.SeznamKav;
import util.SeznamKavaren;

/**
 *
 * @author Cvesspy
 */
public class topButtonBar {
    
    private VBox root;
    private ToolBar toolbar;
    private final SeznamKav seznamKav;
    private final SeznamKavaren seznamKavaren;
    
    public topButtonBar(SeznamKav kavy, SeznamKavaren kavarny,VBox vBox){
        this.root = vBox;        
        this.seznamKav = kavy;
        this.seznamKavaren = kavarny;
        build();
    }
    
    private void build(){
        toolbar = new ToolBar();
        //toolbar.
    }
    
}
