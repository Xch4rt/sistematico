/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni.edui.ni.controller;

import java.awt.List;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import uni.edui.ni.frames.FactureFr;
/**
 *
 * @author JADPA03
 */
public class FactureFrmController {
    private FactureFr facture;
    private DefaultTableModel dModel;
    private String[] columns = {"Cod", "Nombre", "Cantidad", "Precio", "Sub Total"};
    private List data;

    public FactureFrmController(FactureFr facture) {
        this.facture = facture;
        initComponent();
    }
    
    private void initComponent()
    {
        dModel = new DefaultTableModel(null, columns);
        facture.getTblView().setModel(dModel);
       
        
        facture.getBtnAgregar().addActionListener((e)->{
            btnAgregarActionListener(e);
        });
    }
    
    public void btnAgregarActionListener(ActionEvent e)
    {
        float cant, precio;
        if (!facture.getTxtCod().getText().equalsIgnoreCase("") && !facture.getTxtName().getText().equalsIgnoreCase(""))
        {
            String[] arr = new String[5];
            
            arr[0] = facture.getTxtCod().getText();
            arr[1] = facture.getTxtName().getText();
            arr[2] = facture.getSpnCant().getModel().getValue().toString();
            arr[3] = facture.getFmtPrice().getText();
            
            cant = Float.parseFloat(arr[2]);
            precio = Float.parseFloat(arr[3]);
            arr[4] = Float.toString(cant * precio);
            
            dModel.addRow(arr);
            
            facture.getTxtCod().setText("");
            facture.getTxtName().setText("");
        }
        else
        {
            System.out.println("aaaa");
        }
        System.out.println("afasdfasdf");
    }
}
