/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rompecabezas.rompecabezas;

import java.awt.Dimension;
import static javax.swing.BorderFactory.createEmptyBorder;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Bryam
 */
public class bPieza6 extends javax.swing.JButton {

    private Icon image1 = new ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/logo/logoN.png"));

    public bPieza6() {
        this.setPreferredSize(new Dimension(160, 140));
        this.setContentAreaFilled(false);
        this.setBorder(createEmptyBorder(1, 1, 1, 1));
        this.setIcon(image1);
        this.setDisabledIcon(image1);
        this.setVisible(true);
    }
}
