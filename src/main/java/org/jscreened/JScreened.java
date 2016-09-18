package org.jscreened;

import org.jscreened.ui.tray.Notifier;
import org.jscreened.util.Utils;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Kevin on 11-11-2015.
 */
public final class JScreened {

    public static void main(final String... args) {
        EventQueue.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                    UnsupportedLookAndFeelException ignored) {
            }
        });

        Utils.disableLogging(); //disable jNativeHook logging


        final Notifier notifier = new Notifier();
        notifier.start();
    }
}
