/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package praktinistrys;

/**
 *
 * @author Vytenis
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
             pradzia();      
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bustoKreditasButton = new javax.swing.JButton();
        vartojimoKreditasButton = new javax.swing.JButton();
        vaikuSkaiciusSeimojeTextField = new javax.swing.JTextField();
        seimosPajamosAtskaiciusMokesciusLabel = new javax.swing.JLabel();
        seimosPajamosAtskaiciusMokesciusTextField = new javax.swing.JTextField();
        seimosFinansiaiIsipareigojimaiLabel = new javax.swing.JLabel();
        seimosFinansiniaiIsipareigojimaiTextField = new javax.swing.JTextField();
        paskolosSumaLabel = new javax.swing.JLabel();
        paskolosSumaTextField = new javax.swing.JTextField();
        laikotarpisLabel = new javax.swing.JLabel();
        laikotarpisTextField = new javax.swing.JTextField();
        kreditoMenesineImokaLabel = new javax.swing.JLabel();
        kreditoMenesineImokaTextField = new javax.swing.JTextField();
        bendriosGrazintinosSumosApskaiciavimasLabel = new javax.swing.JLabel();
        bendrosGrazintinosSUmosApskaiciavimasTextField = new javax.swing.JTextField();
        sutartiesSudarymoMokescioDydis = new javax.swing.JLabel();
        sutartiesSudarymoMokescioDydisTextField = new javax.swing.JTextField();
        galimybeGrazintiKreditaNustatymui = new javax.swing.JLabel();
        galimybeGrazintiKreditaNustatymuiTextField = new javax.swing.JTextField();
        atsakymasButton = new javax.swing.JButton();
        atsakymas2Button = new javax.swing.JButton();
        klaidaTextField = new javax.swing.JTextField();
        vaikuSkaiciusSeimojeLabel = new javax.swing.JLabel();
        vaikuSkaiciusSeimojeApibrezimas = new javax.swing.JLabel();
        seimosPajamosAtskaiciusMokesciusIspejimas = new javax.swing.JLabel();
        seimosFinansiniaiIsipareigojimaiIspejimas = new javax.swing.JLabel();
        laikotarpisIspejimas = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        paskolosSumaIspejimas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bustoKreditasButton.setText("Busto kreditas");
        bustoKreditasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bustoKreditasButtonActionPerformed(evt);
            }
        });

        vartojimoKreditasButton.setText("Vartojimo kreditas");
        vartojimoKreditasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vartojimoKreditasButtonActionPerformed(evt);
            }
        });

        seimosPajamosAtskaiciusMokesciusLabel.setText("Seimos pajamos atskaicius mokescius(men)");

        seimosPajamosAtskaiciusMokesciusTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seimosPajamosAtskaiciusMokesciusTextFieldActionPerformed(evt);
            }
        });

        seimosFinansiaiIsipareigojimaiLabel.setText("Seimos finansiniai isipareigojimai(isiskolinimai)(men)");

        paskolosSumaLabel.setText("Paskolos suma");

        laikotarpisLabel.setText("Laikotarpis");

        kreditoMenesineImokaLabel.setText("Kredito menesine imoka");

        kreditoMenesineImokaTextField.setEditable(false);

        bendriosGrazintinosSumosApskaiciavimasLabel.setText("Bendros grazintinos sumos apskaic");

        bendrosGrazintinosSUmosApskaiciavimasTextField.setEditable(false);

        sutartiesSudarymoMokescioDydis.setText("Sutarties sudarymo mokescio dydis");

        sutartiesSudarymoMokescioDydisTextField.setEditable(false);

        galimybeGrazintiKreditaNustatymui.setText("Galimybe grazinti kredita nustatymas");

        galimybeGrazintiKreditaNustatymuiTextField.setEditable(false);

        atsakymasButton.setText("Skaiciuoti");
        atsakymasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atsakymasButtonActionPerformed(evt);
            }
        });

        atsakymas2Button.setText("Skaiciuoti");
        atsakymas2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atsakymas2ButtonActionPerformed(evt);
            }
        });

        klaidaTextField.setEditable(false);
        klaidaTextField.setDisabledTextColor(new java.awt.Color(255, 51, 51));

        vaikuSkaiciusSeimojeLabel.setText("Vaiku skaicius seimoje");

        jLabel1.setText("€");

        jLabel2.setText("€");

        jLabel3.setText("€");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(bustoKreditasButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(vartojimoKreditasButton)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(seimosPajamosAtskaiciusMokesciusLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(seimosPajamosAtskaiciusMokesciusTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(seimosPajamosAtskaiciusMokesciusIspejimas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(vaikuSkaiciusSeimojeLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(vaikuSkaiciusSeimojeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(vaikuSkaiciusSeimojeApibrezimas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(seimosFinansiaiIsipareigojimaiLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(seimosFinansiniaiIsipareigojimaiTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(seimosFinansiniaiIsipareigojimaiIspejimas, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(laikotarpisLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(laikotarpisTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(laikotarpisIspejimas, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(paskolosSumaLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(paskolosSumaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(paskolosSumaIspejimas, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(atsakymasButton, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(atsakymas2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(119, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(klaidaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(kreditoMenesineImokaLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(galimybeGrazintiKreditaNustatymui)
                                        .addGap(28, 28, 28))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(sutartiesSudarymoMokescioDydis)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(bendriosGrazintinosSumosApskaiciavimasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(sutartiesSudarymoMokescioDydisTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                    .addComponent(bendrosGrazintinosSUmosApskaiciavimasTextField)
                                    .addComponent(kreditoMenesineImokaTextField))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)))
                            .addComponent(galimybeGrazintiKreditaNustatymuiTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bustoKreditasButton)
                    .addComponent(vartojimoKreditasButton))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(vaikuSkaiciusSeimojeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(vaikuSkaiciusSeimojeLabel))
                            .addComponent(vaikuSkaiciusSeimojeApibrezimas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(seimosPajamosAtskaiciusMokesciusIspejimas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(seimosPajamosAtskaiciusMokesciusLabel)
                                .addComponent(seimosPajamosAtskaiciusMokesciusTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(seimosFinansiaiIsipareigojimaiLabel)
                            .addComponent(seimosFinansiniaiIsipareigojimaiTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seimosFinansiniaiIsipareigojimaiIspejimas, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(paskolosSumaLabel)
                            .addComponent(paskolosSumaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(paskolosSumaIspejimas, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(laikotarpisLabel)
                    .addComponent(laikotarpisTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(laikotarpisIspejimas, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(atsakymasButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(atsakymas2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(klaidaTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kreditoMenesineImokaLabel)
                    .addComponent(kreditoMenesineImokaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bendriosGrazintinosSumosApskaiciavimasLabel)
                    .addComponent(bendrosGrazintinosSUmosApskaiciavimasTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sutartiesSudarymoMokescioDydis)
                    .addComponent(sutartiesSudarymoMokescioDydisTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(galimybeGrazintiKreditaNustatymuiTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(galimybeGrazintiKreditaNustatymui))
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bustoKreditasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bustoKreditasButtonActionPerformed
           
        vartojimoKreditasButton.setVisible(false); 
        OnVisible();
        atsakymasButton.setVisible(true);
        vaikuSkaiciusSeimojeApibrezimas.setText("nuo 0 iki 10");
        seimosPajamosAtskaiciusMokesciusIspejimas.setText("nuo 0 iki 30000");
        seimosFinansiniaiIsipareigojimaiIspejimas.setText("nuo 0 iki 15000");
        laikotarpisIspejimas.setText("ne daugiau 40(metu)");               
    }//GEN-LAST:event_bustoKreditasButtonActionPerformed

   
      
        
     
    

    private void atsakymasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atsakymasButtonActionPerformed

       onVisibleAtsakymai();     
               
         Skaiciavimai skaiciavimai = new Skaiciavimai ();
        
        skaiciavimai.setPaskolosSuma(Integer.parseInt(paskolosSumaTextField.getText()));
        
        skaiciavimai.setLaikotarpis(Integer.parseInt(laikotarpisTextField.getText()));
        
        skaiciavimai.setSeimosPajamosAtskaiciusMokescius(Integer.parseInt(seimosPajamosAtskaiciusMokesciusTextField.getText()));
        skaiciavimai.setSeimosFinansiniaiIsipareigojimai (Integer.parseInt(seimosFinansiniaiIsipareigojimaiTextField.getText()));
        skaiciavimai.setVaikuSkaiciusSeimoje(Integer.parseInt(vaikuSkaiciusSeimojeTextField.getText()));
            
       if (skaiciavimai.tikrinti_duomenys()){  
              
        // SUTARTIES SUDARYMO MOKESTIS !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! \\
        
       skaiciavimai.setSutartiesSudarymoMokestisAtsakymas(skaiciavimai.getPaskolosSuma () * 0.13 / 100);
       
             if (skaiciavimai.getSutartiesSudarymoMokestisAtsakymas()< 144.81){
            skaiciavimai.setAtsakymas1(144.81);
       
            sutartiesSudarymoMokescioDydisTextField.setText(skaiciavimai.getAtsakymas1()  + "" );
          
             }  else{
            skaiciavimai.setAtsakymas2(skaiciavimai.getSutartiesSudarymoMokestisAtsakymas());
           
           sutartiesSudarymoMokescioDydisTextField.setText(skaiciavimai.getAtsakymas2() + "");
              }
        
         // PABAIGA!!!!!!!!!!    SUTARTIES SUDARYMO MOKESTIS !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! \\
        
        
        //     BENDROS GRAZINTINOS SUMOS APSKAICIAVIMAS !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! \\     
      
     
          skaiciavimai.setBendrosGrazintinosSumosApskaiciavimasAtsakymas(skaiciavimai.getPaskolosSuma2() + (skaiciavimai.getPaskolosSuma2() * 2 / 100 * skaiciavimai.getLaikotarpis()));
           // SVARBU!!!!!!!! 2 siaip pasirinkau, nes nezinau palukanu normu;
          if ( skaiciavimai.tikrinti_laikotarpi(40)){
                 // NEGALIMAAAAA
                 bendrosGrazintinosSUmosApskaiciavimasTextField.setText("Nesuteikiama paskola");
          }else{
                       
         // PABAIGA!!!!!!!! BENDROS GRAZINTINOS SUMOS APSKAICIAVIMAS !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! \\\\    
              
         // KREDITO MENESINES IMOKOS APSKAICIAVIMUI !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! \\\\              
                      
              skaiciavimai.setKreditoMenesineImokaApskaiciavimas(skaiciavimai.getBendrosGrazintinosSumosApskaiciavimasAtsakymas() / skaiciavimai.getLaikotarpis() / 12);
             
         //  PABAIGA!!!!!!!!!!!!!      KREDITO MENESINES IMOKOS APSKAICIAVIMUI !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\           
                 
          //GALIMYBE GRAZINTI KREDITA NUSTATYMUI !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! \\                              
                               
            skaiciavimai.setRealiosMenesinesPajamos(skaiciavimai.getSeimosPajamosAtskaiciusMokescius() - skaiciavimai.getSeimosFinansiniaiIsipareigojimai() - (skaiciavimai.getVaikuSkaiciusSeimoje() * 200));
        
           if (skaiciavimai.paskolos_suteikimas()){
                 galimybeGrazintiKreditaNustatymuiTextField.setText("Bankas nesuteikia kredito");
                 kreditoMenesineImokaTextField.setText("");
                 bendrosGrazintinosSUmosApskaiciavimasTextField.setText("");
                 sutartiesSudarymoMokescioDydisTextField.setText("");
          
           }else{
               
                 galimybeGrazintiKreditaNustatymuiTextField.setText("Bankas suteikia kredita");
                 kreditoMenesineImokaTextField.setText(skaiciavimai.getKreditoMenesineImokaApskaiciavimas() + ""); 
                 bendrosGrazintinosSUmosApskaiciavimasTextField.setText(skaiciavimai.getBendrosGrazintinosSumosApskaiciavimasAtsakymas() + "");
             }  
       
           // PABAIGA!!!!!!!!!!!!!!  GALIMYBE GRAZINTI KREDITA NUSTATYMUI !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! \\                        
              
          }          
          }else{
           klaidaTextField.setVisible(true);
           klaidaTextField.setText("Patikrinkite savo ivestus duomenis");
       }

    }//GEN-LAST:event_atsakymasButtonActionPerformed

    private void onVisibleAtsakymai() {
        kreditoMenesineImokaLabel.setVisible(true);
        kreditoMenesineImokaTextField.setVisible(true);
        bendriosGrazintinosSumosApskaiciavimasLabel.setVisible(true);
        bendrosGrazintinosSUmosApskaiciavimasTextField.setVisible(true);
        sutartiesSudarymoMokescioDydis.setVisible(true);
        sutartiesSudarymoMokescioDydisTextField.setVisible(true);
        galimybeGrazintiKreditaNustatymui.setVisible(true);
        galimybeGrazintiKreditaNustatymuiTextField.setVisible(true);
        
        jLabel1.setVisible(true);
        jLabel2.setVisible(true);
        jLabel3.setVisible(true); 
        
        kreditoMenesineImokaTextField.setText("");
        bendrosGrazintinosSUmosApskaiciavimasTextField.setText("");
        sutartiesSudarymoMokescioDydisTextField.setText("");
        galimybeGrazintiKreditaNustatymuiTextField.setText("");
    }

 

    private void vartojimoKreditasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vartojimoKreditasButtonActionPerformed
        // TODO add your handling code here:
        bustoKreditasButton.setVisible(false);
        OnVisible();
        paskolosSumaIspejimas.setVisible(true); // sitas atskirai, nes busto kredite, nera limitu
        paskolosSumaIspejimas.setText("nuo 300 iki 26000");
        atsakymas2Button.setVisible(true);
        
             vaikuSkaiciusSeimojeApibrezimas.setText("nuo 0 iki 10");
            seimosPajamosAtskaiciusMokesciusIspejimas.setText("nuo 0 iki 10000");
            seimosFinansiniaiIsipareigojimaiIspejimas.setText("nuo 0 iki 5000");
            laikotarpisIspejimas.setText("ne daugiau 5(metu)");
        
     
    }//GEN-LAST:event_vartojimoKreditasButtonActionPerformed

    private void OnVisible() {
        vaikuSkaiciusSeimojeLabel.setVisible(true);
        vaikuSkaiciusSeimojeTextField.setVisible(true);
        seimosPajamosAtskaiciusMokesciusLabel.setVisible(true);
        seimosPajamosAtskaiciusMokesciusTextField.setVisible(true);
        seimosFinansiaiIsipareigojimaiLabel.setVisible(true);
        seimosFinansiniaiIsipareigojimaiTextField.setVisible(true);
        paskolosSumaLabel.setVisible(true);
        paskolosSumaTextField.setVisible(true);
        laikotarpisLabel.setVisible(true);
        laikotarpisTextField.setVisible(true);
        vaikuSkaiciusSeimojeApibrezimas.setVisible(true);
        seimosPajamosAtskaiciusMokesciusIspejimas.setVisible(true);
        seimosFinansiniaiIsipareigojimaiIspejimas.setVisible(true);
        laikotarpisIspejimas.setVisible(true);
        
        
    }

    
    private void atsakymas2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atsakymas2ButtonActionPerformed
        // TODO add your handling code here:
        
       onVisibleAtsakymai();   
       
       klaidaTextField.setVisible(false);
     
         Skaiciavimai skaiciavimai = new Skaiciavimai ();
         
        skaiciavimai.setPaskolosSuma(Integer.parseInt(paskolosSumaTextField.getText()));
       
        skaiciavimai.setLaikotarpis(Integer.parseInt(laikotarpisTextField.getText()));
        
        
         skaiciavimai.setSeimosFinansiniaiIsipareigojimai(Integer.parseInt(seimosFinansiniaiIsipareigojimaiTextField.getText()));
         skaiciavimai.setVaikuSkaiciusSeimoje(Integer.parseInt(vaikuSkaiciusSeimojeTextField.getText()));
            
        if (skaiciavimai.tikrinti_busto_duomenys()){
                
        // SUTARTIES SUDARYMO MOKESTIS !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! \\
        
            skaiciavimai.setSutartiesSudarymoMokestisAtsakymas(skaiciavimai.getPaskolosSuma() * 1 / 100);
       
             if (skaiciavimai.getSutartiesSudarymoMokestisAtsakymas()< 28.96){
                skaiciavimai.setAtsakymas2(28.96);
                sutartiesSudarymoMokescioDydisTextField.setText(skaiciavimai.getAtsakymas1() + "");
             }else{
                skaiciavimai.setAtsakymas2(skaiciavimai.getSutartiesSudarymoMokestisAtsakymas());
                sutartiesSudarymoMokescioDydisTextField.setText(skaiciavimai.getAtsakymas2() + "");
             } 
        
         // PABAIGA!!!!!!!!!!    SUTARTIES SUDARYMO MOKESTIS !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! \\
         
         // BENDROS GRAZINTINOS SUMOS APSKAICIAVIMAS !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! \\
       
           skaiciavimai.setBendrosGrazintinosSumosApskaiciavimasAtsakymas(skaiciavimai.getPaskolosSuma2 () + (skaiciavimai.getPaskolosSuma2() * 2 / 100 * skaiciavimai.getLaikotarpis()));
           // SVARBU!!!!!!!! 2 siaip pasirinkau, nes nezinau palukanu normu;
          if (skaiciavimai.tikrinti_laikotarpi(5)){
                 // NEGALIMAAAAA
                 bendrosGrazintinosSUmosApskaiciavimasTextField.setText("Nesuteikiama paskola");
          }else{
                      
         // PABAIGA!!!!!!!! BENDROS GRAZINTINOS SUMOS APSKAICIAVIMAS !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! \\\\    
                
          // KREDITO MENESINES IMOKOS APSKAICIAVIMUI !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! \\\\              
                      
                      
              skaiciavimai.setKreditoMenesineImokaApskaiciavimas(skaiciavimai.getBendrosGrazintinosSumosApskaiciavimasAtsakymas() / skaiciavimai.getLaikotarpis() / 12);
          //  PABAIGA!!!!!!!!!!!!!      KREDITO MENESINES IMOKOS APSKAICIAVIMUI !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\     
         
           //GALIMYBE GRAZINTI KREDITA NUSTATYMUI !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! \\                              
                               
            skaiciavimai.setRealiosMenesinesPajamos(skaiciavimai.getSeimosPajamosAtskaiciusMokescius() - skaiciavimai.getSeimosFinansiniaiIsipareigojimai() - (skaiciavimai.getVaikuSkaiciusSeimoje() * 200));
        
           if (skaiciavimai.paskolos_suteikimas()){
                  galimybeGrazintiKreditaNustatymuiTextField.setText("Bankas nesuteikia kredito");
                  kreditoMenesineImokaTextField.setText("");
                  bendrosGrazintinosSUmosApskaiciavimasTextField.setText("");
                  sutartiesSudarymoMokescioDydisTextField.setText("");
          
           }else{
               
                 galimybeGrazintiKreditaNustatymuiTextField.setText("Bankas suteikia kredita");
                 kreditoMenesineImokaTextField.setText(skaiciavimai.getKreditoMenesineImokaApskaiciavimas() + ""); 
                 bendrosGrazintinosSUmosApskaiciavimasTextField.setText(skaiciavimai.getBendrosGrazintinosSumosApskaiciavimasAtsakymas() + "");
             }  
       
           // PABAIGA!!!!!!!!!!!!!!  GALIMYBE GRAZINTI KREDITA NUSTATYMUI !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! \\                        
      
          }          
          }else{
           klaidaTextField.setVisible(true);
           klaidaTextField.setText("Patikrinkite savo ivestus duomenis");
          }
         
    }//GEN-LAST:event_atsakymas2ButtonActionPerformed

    private void seimosPajamosAtskaiciusMokesciusTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seimosPajamosAtskaiciusMokesciusTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seimosPajamosAtskaiciusMokesciusTextFieldActionPerformed
          
    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new NewJFrame().setVisible(true); 
            }
        });
    }
    
    
        private void pradzia(){
            bustoKreditasButton.setVisible(true);
            vartojimoKreditasButton.setVisible(true);
            
            vaikuSkaiciusSeimojeLabel.setVisible(false);
            vaikuSkaiciusSeimojeTextField.setVisible(false);
            seimosPajamosAtskaiciusMokesciusLabel.setVisible(false);
            seimosPajamosAtskaiciusMokesciusTextField.setVisible(false);
            seimosFinansiaiIsipareigojimaiLabel.setVisible(false);
            seimosFinansiniaiIsipareigojimaiTextField.setVisible(false);
            paskolosSumaLabel.setVisible(false);
            paskolosSumaTextField.setVisible(false);
            laikotarpisLabel.setVisible(false);
            laikotarpisTextField.setVisible(false);
            atsakymasButton.setVisible(false);
            atsakymas2Button.setVisible(false);
            klaidaTextField.setVisible(false);
            vaikuSkaiciusSeimojeApibrezimas.setVisible(false);
            seimosPajamosAtskaiciusMokesciusIspejimas.setVisible(false);
            seimosFinansiniaiIsipareigojimaiIspejimas.setVisible(false);
            laikotarpisIspejimas.setVisible(false);
            
            jLabel1.setVisible(false);
            jLabel2.setVisible(false);
            jLabel3.setVisible(false);        
                    
            
            kreditoMenesineImokaLabel.setVisible(false);
            kreditoMenesineImokaTextField.setVisible(false);
            bendriosGrazintinosSumosApskaiciavimasLabel.setVisible(false);
            bendrosGrazintinosSUmosApskaiciavimasTextField.setVisible(false);
            sutartiesSudarymoMokescioDydis.setVisible(false);
            sutartiesSudarymoMokescioDydisTextField.setVisible(false);
            galimybeGrazintiKreditaNustatymui.setVisible(false);
            galimybeGrazintiKreditaNustatymuiTextField.setVisible(false);

        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atsakymas2Button;
    private javax.swing.JButton atsakymasButton;
    private javax.swing.JLabel bendriosGrazintinosSumosApskaiciavimasLabel;
    private javax.swing.JTextField bendrosGrazintinosSUmosApskaiciavimasTextField;
    private javax.swing.JButton bustoKreditasButton;
    private javax.swing.JLabel galimybeGrazintiKreditaNustatymui;
    private javax.swing.JTextField galimybeGrazintiKreditaNustatymuiTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField klaidaTextField;
    private javax.swing.JLabel kreditoMenesineImokaLabel;
    private javax.swing.JTextField kreditoMenesineImokaTextField;
    private javax.swing.JLabel laikotarpisIspejimas;
    private javax.swing.JLabel laikotarpisLabel;
    private javax.swing.JTextField laikotarpisTextField;
    private javax.swing.JLabel paskolosSumaIspejimas;
    private javax.swing.JLabel paskolosSumaLabel;
    private javax.swing.JTextField paskolosSumaTextField;
    private javax.swing.JLabel seimosFinansiaiIsipareigojimaiLabel;
    private javax.swing.JLabel seimosFinansiniaiIsipareigojimaiIspejimas;
    private javax.swing.JTextField seimosFinansiniaiIsipareigojimaiTextField;
    private javax.swing.JLabel seimosPajamosAtskaiciusMokesciusIspejimas;
    private javax.swing.JLabel seimosPajamosAtskaiciusMokesciusLabel;
    private javax.swing.JTextField seimosPajamosAtskaiciusMokesciusTextField;
    private javax.swing.JLabel sutartiesSudarymoMokescioDydis;
    private javax.swing.JTextField sutartiesSudarymoMokescioDydisTextField;
    private javax.swing.JLabel vaikuSkaiciusSeimojeApibrezimas;
    private javax.swing.JLabel vaikuSkaiciusSeimojeLabel;
    private javax.swing.JTextField vaikuSkaiciusSeimojeTextField;
    private javax.swing.JButton vartojimoKreditasButton;
    // End of variables declaration//GEN-END:variables
}
