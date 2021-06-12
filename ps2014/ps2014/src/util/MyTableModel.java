/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package util;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author usuario
 */
public class MyTableModel extends AbstractTableModel {
    /** Nombre de las columnas. */
     private final String[] columnNames;
     /** Datos. */
     private final Object[][] data;

     /**
      * Constructor.
      * @param columnNames Nombres de las columnas
      * @param data Datos de la tabla
      */
     public MyTableModel(String[] columnNames, Object[][] data) {
      this.columnNames = columnNames;
      this.data = data;
     }

     @Override
     public String getColumnName(int column) {
      // Nombre de las columnas para la cabecera
      return columnNames[column];
     }

     @Override
     public int getRowCount() {
      // Devuelve el número de filas
      return data != null ? data.length : 0;
     }

     @Override
     public int getColumnCount() {
      // Devuelve el número de columnas
      return columnNames.length;
     }

     /**
      * Nos devolverá la clase que contiene cada columna,
      * es necesario para trabajar correctamente con los componentes
      * que mostraremos en la tabla.
     * @param columnIndex
     * @return 
      */
     @Override
     public Class getColumnClass(int columnIndex) {
      Class clazz = Object.class;

      Object aux = getValueAt(0, columnIndex);
      if (aux != null) {
       clazz = aux.getClass();
      }

      return clazz;
     }

     @Override
     public Object getValueAt(int rowIndex, int columnIndex) {
      // Devuelve el valor que se debe mostrar en la tabla en cada celda
      return data[rowIndex][columnIndex];
     }

        @Override
     public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
         // Si queremos que la tabla sea editable deberemos establecer estos valores
         data[rowIndex][columnIndex] = aValue;
         fireTableCellUpdated(rowIndex, columnIndex);
        }

     @Override
     public boolean isCellEditable(int rowIndex, int columnIndex) {
      // Permitimos editar todas las celdas de la tabla
      return true;
     }

     /**
      * Nos servira para limpiar la información de una fila
      * @param row
      */
     public void reset(int row) {

      for (int i = 0; i < data[row].length - 1; i++) {
       // Para las columnas con String
       if (getColumnClass(i) == String.class) {
        setValueAt("", row, i);
       } else if(getColumnClass(i) == Boolean.class) {
        setValueAt(false, row, i);
       }
      }

     }
     
//     this.jTable1.getColumnModel().getColumn(0).setPreferredWidth(30);
//    this.jTable1.getColumnModel().getColumn(1).setPreferredWidth(150);
//    jTable1.getTableHeader().setFont(new Font("Segoe UI", Font.ITALIC, 18));
//    jTable1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
//    jTable1.setRowHeight(30);
//    model = (DefaultTableModel) this.jTable1.getModel();
//    model.setNumRows(0);
     
//     MyTableModel model = new MyTableModel(columnNames, data);
//    // Establecemos el modelo
//    JTable table = new JTable(model);
     
     
//    private void setOcultarColumnasJTable(JTable tbl, int columna[])
//    {
//        for(int i=0;i<columna.length;i++)
//             tbl.getColumnModel().getColumn(columna[i]).setMaxWidth(0);
//             tbl.getColumnModel().getColumn(columna[i]).setMinWidth(0);
//             tbl.getTableHeader().getColumnModel().getColumn(columna[i]).setMaxWidth(0);
//             tbl.getTableHeader().getColumnModel().getColumn(columna[i]).setMinWidth(0);
//        }
//    }
}
