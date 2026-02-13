package CalculadoraBasica;

import java.awt.*;
import javax.swing.*;

public class Calculadora extends JFrame{
    
    private JPanel pnContenido;
    private JTextArea tfResultado;
    private JButton btOperacion, btLimpiar;
    private JButton btSuma, btResta, btMultiplicacion, btDivicion;
    private JButton bt0, bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9;
    
    private String a = "", b = "", c = "";
    private int x, y, z;
    private boolean hayResultado = false;
    
    public Calculadora(){
        componentes();
    }
    
    private void componentes() {
        configuracionF();
         
        pnResultado();
        pnComponentes();
        
        resultadoNumeros();
        resultadoOperaciones();
    }
    
    private void configuracionF() {
        Dimension tamaño = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(tamaño.width - 840, tamaño.height - 480);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        setTitle("CALCULADORA");
        setForeground(Color.BLACK);
        
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
    
    private void pnResultado() {
        JPanel pnResultado = new JPanel();
        pnResultado.setBackground(Color.DARK_GRAY);
        pnResultado.setBorder(BorderFactory.createEmptyBorder(10, 5, 10, 5));
        pnResultado.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        tfResultado = new JTextArea();
        tfResultado.setBackground(Color.DARK_GRAY);
        tfResultado.setForeground(Color.WHITE);
        pnResultado.add(tfResultado, BorderLayout.CENTER);
        add(pnResultado, BorderLayout.NORTH);
    }
    
    private void pnComponentes() {
        pnContenido = new JPanel(new GridBagLayout());
        pnContenido.setBackground(new Color(0, 0, 71));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(1, 1, 1, 1);
        
        operadores(gbc);
        numeros(gbc);
        
        add(pnContenido, BorderLayout.CENTER);
    }
    
    private void operacion(){
        //System.out.println("A: "+ a);
        //System.out.println("B: "+ b);
        if(!a.isEmpty() && !b.isEmpty()){
            switch(c){
                case "+":
                    y = Integer.parseInt(a);
                    x = Integer.parseInt(b);
                    z = y + x;
                    a = Integer.toString(z);
                    tfResultado.setText(a);
                    b = "";
                    c = "";
                    hayResultado = true;
                break;
                case "-":
                    y = Integer.parseInt(a);
                    x = Integer.parseInt(b);
                    z = y - x;
                    a = Integer.toString(z);
                    tfResultado.setText(a);
                    b = "";
                    c = "";
                    hayResultado = true;
                break;
                case "*":
                    y = Integer.parseInt(a);
                    x = Integer.parseInt(b);
                    z = y * x;
                    a = Integer.toString(z);
                    tfResultado.setText(a);
                    b = "";
                    c = "";
                    hayResultado = true;
                break;
                case "/":
                    float w, k, v;
                    w = Float.parseFloat(a);
                    k = Float.parseFloat(b);
                    v = w / k;
                    a = Float.toString(v);
                    tfResultado.setText(a);
                    b = "";
                    c = "";
                    hayResultado = true;
                break;
            }
        }
    }
    
    private void resultadoOperaciones(){
        btOperacion.addActionListener(e -> {
            operacion();
        } );
        
        btLimpiar.addActionListener(e -> {
            tfResultado.setText("");
            a = "";
            b = "";
            c = "";
            hayResultado = false;
        } );
        
        btSuma.addActionListener(e -> {
            if(!tfResultado.getText().isEmpty() && c.isEmpty()){
                String suma = tfResultado.getText();
                suma += "+";
                c = "+";
                tfResultado.setText(suma);
            }
        } );
        
        btResta.addActionListener(e -> {
            if(!tfResultado.getText().isEmpty() && c.isEmpty()){
                String resta = tfResultado.getText();
                resta += "-";
                c = "-";
                tfResultado.setText(resta);
            }
        } );
        
        btMultiplicacion.addActionListener(e -> {
            if(!tfResultado.getText().isEmpty() && c.isEmpty()){
                String multiplicacion = tfResultado.getText();
                multiplicacion += "*";
                c = "*";
                tfResultado.setText(multiplicacion);
            }
        } );
        
        btDivicion.addActionListener(e -> {
            if(!tfResultado.getText().isEmpty() && c.isEmpty()){
                String divicion = tfResultado.getText();
                divicion += "/";
                c = "/";
                tfResultado.setText(divicion);
            }
        } );
    }
    
    private void resultadoNumeros(){
        bt0.addActionListener(e -> {
            if(!c.isEmpty()){
                String cero = tfResultado.getText();
                cero += "0"; 
                b += "0";
                tfResultado.setText(cero); 
            }
            else if(!hayResultado) {
                a += "0";
                tfResultado.setText(a);
            }
        } );
        
        bt1.addActionListener(e -> {
            if(!c.isEmpty()){
                String uno = tfResultado.getText();
                uno += "1"; 
                b += "1";
                tfResultado.setText(uno); 
            }
            else if(!hayResultado) {
                a += "1";
                tfResultado.setText(a);
            }
        } );
        
        bt2.addActionListener(e -> {
            if(!c.isEmpty()){
                String dos = tfResultado.getText();
                dos += "2";
                b += "2";
                tfResultado.setText(dos);
            }
            else if(!hayResultado) {
                a += "2";
                tfResultado.setText(a);
            }
        } );
        
        bt3.addActionListener(e -> {
            if(!c.isEmpty()){
                String tres = tfResultado.getText();
                tres += "3";
                b += "3";
                tfResultado.setText(tres);
            }
            else if(!hayResultado) {
                a += "3";
                tfResultado.setText(a);
            }
        } );
        
        bt4.addActionListener(e -> {
            if(!c.isEmpty()){
                String cuatro = tfResultado.getText();
                cuatro += "4";
                b += "4";
                tfResultado.setText(cuatro);
            }
            else if(!hayResultado) {
                a += "4";
                tfResultado.setText(a);
            }
        } );
        
        bt5.addActionListener(e -> {
            if(!c.isEmpty()){
                String sinco = tfResultado.getText();
                sinco += "5";
                b += "5";
                tfResultado.setText(sinco);
            }
            else if(!hayResultado) {
                a += "5";
                tfResultado.setText(a);
            }
        } );
        
        bt6.addActionListener(e -> {
            if(!c.isEmpty()){
                String seis = tfResultado.getText();
                seis += "6";
                b += "6";
                tfResultado.setText(seis);
            }
            else if(!hayResultado) {
                a += "6";
                tfResultado.setText(a);
            }
        } );
        
        bt7.addActionListener(e -> {
            if(!c.isEmpty()){
                String siete = tfResultado.getText();
                siete += "7";
                b += "7";
                tfResultado.setText(siete);
            }
            else if(!hayResultado) {
                a += "7";
                tfResultado.setText(a);
            }
        } );
        
        bt8.addActionListener(e -> {
            if(!c.isEmpty()){
                String ocho = tfResultado.getText();
                ocho += "8";
                b += "8";
                tfResultado.setText(ocho);
            }
            else if(!hayResultado) {
                a += "8";
                tfResultado.setText(a);
            }
        } );
        
        bt9.addActionListener(e -> {
            if(!c.isEmpty()){
                String nueve = tfResultado.getText();
                nueve += "9";
                b += "9";
                tfResultado.setText(nueve);
            }
            else if(!hayResultado) {
                a += "9";
                tfResultado.setText(a);
            }
        } );
    }

    private void operadores(GridBagConstraints gbc) {
        gbc.gridx = 3;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0;
        gbc.weighty = 0.0;
        JPanel pnSuma = new JPanel(new BorderLayout());
        pnSuma.setBorder(BorderFactory.createEmptyBorder(4, 2, 4, 2));
        pnSuma.setBackground(new Color(135, 135, 135));
        btSuma = new JButton("+");
        btSuma.setBackground(new Color(115, 115, 115));
        btSuma.setForeground(Color.WHITE);
        pnSuma.add(btSuma, BorderLayout.CENTER);
        pnContenido.add(pnSuma, gbc);
        
        gbc.gridx = 3;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weighty = 0.0;
        JPanel pnResta = new JPanel(new BorderLayout());
        pnResta.setBorder(BorderFactory.createEmptyBorder(4, 2, 4, 2));
        pnResta.setBackground(new Color(135, 135, 135));
        btResta = new JButton("-");
        btResta.setBackground(new Color(115, 115, 115));
        btResta.setForeground(Color.WHITE);
        pnResta.add(btResta, BorderLayout.CENTER);
        pnContenido.add(pnResta, gbc);
        
        gbc.gridx = 3;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weighty = 0.0;
        JPanel pnMultiplicacion = new JPanel(new BorderLayout());
        pnMultiplicacion.setBorder(BorderFactory.createEmptyBorder(4, 2, 4, 2));
        pnMultiplicacion.setBackground(new Color(135, 135, 135));
        btMultiplicacion = new JButton("*");
        btMultiplicacion.setBackground(new Color(115, 115, 115));
        btMultiplicacion.setForeground(Color.WHITE);
        pnMultiplicacion.add(btMultiplicacion, BorderLayout.CENTER);
        pnContenido.add(pnMultiplicacion, gbc);
        
        gbc.gridx = 3;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weighty = 0.0;
        JPanel pnDivicion = new JPanel(new BorderLayout());
        pnDivicion.setBorder(BorderFactory.createEmptyBorder(4, 2, 4, 2));
        pnDivicion.setBackground(new Color(135, 135, 135));
        btDivicion = new JButton("/");
        btDivicion.setBackground(new Color(115, 115, 115));
        btDivicion.setForeground(Color.WHITE);
        pnDivicion.add(btDivicion, BorderLayout.CENTER);
        pnContenido.add(pnDivicion, gbc);
        
        gbc.gridx = 2;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0;
        JPanel pnOperacion = new JPanel(new BorderLayout());
        pnOperacion.setBorder(BorderFactory.createEmptyBorder(4, 2, 4, 2));
        pnOperacion.setBackground(new Color(135, 135, 135));
        btOperacion = new JButton("=");
        btOperacion.setBackground(new Color(66, 194, 126));
        btOperacion.setForeground(Color.WHITE);
        pnOperacion.add(btOperacion, BorderLayout.CENTER);
        pnContenido.add(pnOperacion, gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0;
        JPanel pnLimpiar = new JPanel(new BorderLayout());
        pnLimpiar.setBorder(BorderFactory.createEmptyBorder(4, 2, 4, 2));
        pnLimpiar.setBackground(new Color(135, 135, 135));
        btLimpiar = new JButton("EC");
        btLimpiar.setBackground(new Color(252, 81, 81));
        btLimpiar.setForeground(Color.WHITE);
        pnLimpiar.add(btLimpiar, BorderLayout.CENTER);
        pnContenido.add(pnLimpiar, gbc);
    }
    
    private void numeros(GridBagConstraints gbc) {
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.BOTH;
        JPanel pnCero = new JPanel(new BorderLayout());
        pnCero.setBorder(BorderFactory.createEmptyBorder(4, 2, 4, 2));
        pnCero.setBackground(new Color(135, 135, 135));
        bt0 = new JButton("0");
        bt0.setBackground(new Color(115, 115, 115));
        bt0.setForeground(Color.WHITE);
        pnCero.add(bt0, BorderLayout.CENTER);
        pnContenido.add(pnCero, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.BOTH;
        JPanel pnUno = new JPanel(new BorderLayout());
        pnUno.setBorder(BorderFactory.createEmptyBorder(4, 2, 4, 2));
        pnUno.setBackground(new Color(135, 135, 135));
        bt1 = new JButton("1");
        bt1.setBackground(new Color(115, 115, 115));
        bt1.setForeground(Color.WHITE);
        pnUno.add(bt1, BorderLayout.CENTER);
        pnContenido.add(pnUno, gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.BOTH;
        JPanel pnDos = new JPanel(new BorderLayout());
        pnDos.setBorder(BorderFactory.createEmptyBorder(4, 2, 4, 2));
        pnDos.setBackground(new Color(135, 135, 135));
        bt2 = new JButton("2");
        bt2.setBackground(new Color(115, 115, 115));
        bt2.setForeground(Color.WHITE);
        pnDos.add(bt2, BorderLayout.CENTER);
        pnContenido.add(pnDos, gbc);
        
        gbc.gridx = 2;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.BOTH;
        JPanel pnTres = new JPanel(new BorderLayout());
        pnTres.setBorder(BorderFactory.createEmptyBorder(4, 2, 4, 2));
        pnTres.setBackground(new Color(135, 135, 135));
        bt3 = new JButton("3");
        bt3.setBackground(new Color(115, 115, 115));
        bt3.setForeground(Color.WHITE);
        pnTres.add(bt3, BorderLayout.CENTER);
        pnContenido.add(pnTres, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.BOTH;
        JPanel pnCuatro = new JPanel(new BorderLayout());
        pnCuatro.setBorder(BorderFactory.createEmptyBorder(4, 2, 4, 2));
        pnCuatro.setBackground(new Color(135, 135, 135));
        bt4 = new JButton("4");
        bt4.setBackground(new Color(115, 115, 115));
        bt4.setForeground(Color.WHITE);
        pnCuatro.add(bt4, BorderLayout.CENTER);
        pnContenido.add(pnCuatro, gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.BOTH;
        JPanel pnCinco = new JPanel(new BorderLayout());
        pnCinco.setBorder(BorderFactory.createEmptyBorder(4, 2, 4, 2));
        pnCinco.setBackground(new Color(135, 135, 135));
        bt5 = new JButton("5");
        bt5.setBackground(new Color(115, 115, 115));
        bt5.setForeground(Color.WHITE);
        pnCinco.add(bt5, BorderLayout.CENTER);
        pnContenido.add(pnCinco, gbc);
        
        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.BOTH;
        JPanel pnSeis = new JPanel(new BorderLayout());
        pnSeis.setBorder(BorderFactory.createEmptyBorder(4, 2, 4, 2));
        pnSeis.setBackground(new Color(135, 135, 135));
        bt6 = new JButton("6");
        bt6.setBackground(new Color(115, 115, 115));
        bt6.setForeground(Color.WHITE);
        pnSeis.add(bt6, BorderLayout.CENTER);
        pnContenido.add(pnSeis, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.BOTH;
        JPanel pnSiete = new JPanel(new BorderLayout());
        pnSiete.setBorder(BorderFactory.createEmptyBorder(4, 2, 4, 2));
        pnSiete.setBackground(new Color(135, 135, 135));
        bt7 = new JButton("7");
        bt7.setBackground(new Color(115, 115, 115));
        bt7.setForeground(Color.WHITE);
        pnSiete.add(bt7, BorderLayout.CENTER);
        pnContenido.add(pnSiete, gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.BOTH;
        JPanel pnOcho = new JPanel(new BorderLayout());
        pnOcho.setBorder(BorderFactory.createEmptyBorder(4, 2, 4, 2));
        pnOcho.setBackground(new Color(135, 135, 135));
        bt8 = new JButton("8");
        bt8.setBackground(new Color(115, 115, 115));
        bt8.setForeground(Color.WHITE);
        pnOcho.add(bt8, BorderLayout.CENTER);
        pnContenido.add(pnOcho, gbc);
        
        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.BOTH;
        JPanel pnNueve = new JPanel(new BorderLayout());
        pnNueve.setBorder(BorderFactory.createEmptyBorder(4, 2, 4, 2));
        pnNueve.setBackground(new Color(135, 135, 135));
        bt9 = new JButton("9");
        bt9.setBackground(new Color(115, 115, 115));
        bt9.setForeground(Color.WHITE);
        pnNueve.add(bt9, BorderLayout.CENTER);
        pnContenido.add(pnNueve, gbc);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Calculadora());
    }
    
}
