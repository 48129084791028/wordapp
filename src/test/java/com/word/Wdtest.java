package com.word;

import com.word.Word;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import org.junit.*;
import static org.junit.Assert.*;

public class Wdtest {
Word w = new Word();

@Test
public void Pravilno() {
w.tf2.setText("бюллетень");
w.b1.doClick();
assertEquals("Pravilno!", w.tf3.getText());
}
}
