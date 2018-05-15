package jframe;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import dao.impl.CartDAOImpl;
import dao.impl.StoreListDAOImpl;
import dao.impl.StoreProdDAOImpl;
import domain.Cart;
import domain.StoreList;
import domain.StoreProd;

import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

import java.awt.event.MouseAdapter;

public class StoreProdJF extends JFrame implements MouseListener{
   private JTextField textField;
   private JTextField textField_1;
   private JTextField textField_2;
   private JTextField textField_3;
   private JTextField textField_4;
   private JTextField textField_5;
   private JTextField textField_6;
   
   String temp;
   Cart cart = new Cart();
   List<StoreProd> getStoreProdList = new ArrayList<>();
   List<Cart> getCartList = new ArrayList<>();
   JTable table;
   DefaultTableModel model;
   StoreProdDAOImpl spdao = new StoreProdDAOImpl();
   StoreListDAOImpl dao = new StoreListDAOImpl();   
   CartDAOImpl cartDao = new CartDAOImpl();
   StoreProd sp = new StoreProd();
   
   public StoreProdJF() throws Exception {
      setLocationRelativeTo(null);
      getContentPane().setLayout(null);
      setVisible(true);      
      
      JLabel storeProd = new JLabel("상점 별 상품 보기");
      storeProd.setFont(new Font("굴림", Font.PLAIN, 20));
      storeProd.setBounds(14, 12, 206, 24);
      getContentPane().add(storeProd);
      
      JComboBox comboBox = new JComboBox();      
      comboBox.setFont(new Font("굴림", Font.PLAIN, 12));
      
      for(int i=111;i<131;i++){
         comboBox.addItem(dao.getStoreList(i));
      }      
      
      comboBox.setSelectedItem("상점을 선택하세요.");
      
      comboBox.setBounds(14, 36, 216, 30);      
      getContentPane().add(comboBox);
      
      textField_1 = new JTextField();      
      textField_1.setBounds(231, 36, 146, 30);
      textField_1.setColumns(10);
      textField_1.setEditable(false);
      getContentPane().add(textField_1);
      
      comboBox.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {            
            temp = comboBox.getSelectedItem().toString();      
            textField_1.setText(temp);      
         }
      });

      JButton btnNewButton = new JButton("검색");
      btnNewButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            try {
               setTable();
               table.updateUI();
            } catch (Exception e1) {
               e1.printStackTrace();
            }
         }
      });
      btnNewButton.setBounds(383, 36, 94, 30);
      getContentPane().add(btnNewButton);
      
      table = new JTable();      
      JScrollPane jsp = new JScrollPane(table, 
            ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
      jsp.setBounds(29, 77, 404, 404);
      //table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
      setTable();
      table.addMouseListener(this);
      table.setBounds(50, 40, 404, 404);      
      getContentPane().add(jsp);
      
      
      JButton button = new JButton("이전화면");
      button.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            switch(e.getActionCommand()){
            case "이전화면":
               ShoppingTest st = new ShoppingTest();
               setVisible(false);               
               st.setVisible(true);               
               break;
            }
         }
      });
      button.setBounds(546, 354, 105, 24);
      getContentPane().add(button);
      
      JButton button_1 = new JButton("확인");
      button_1.setBounds(498, 38, 105, 27);
      getContentPane().add(button_1);
      
      JLabel label = new JLabel("No.");
      label.setBounds(447, 78, 62, 18);
      getContentPane().add(label);
      
      JLabel label_1 = new JLabel("상품번호");
      label_1.setBounds(447, 119, 62, 18);
      getContentPane().add(label_1);
      
      JLabel label_2 = new JLabel("상품명");
      label_2.setBounds(447, 166, 62, 18);
      getContentPane().add(label_2);
      
      JLabel label_3 = new JLabel("가격");
      label_3.setBounds(447, 267, 62, 18);
      getContentPane().add(label_3);
      
      textField_2 = new JTextField();
      textField_2.setBounds(535, 77, 116, 24);
      getContentPane().add(textField_2);
      textField_2.setColumns(10);
      
      textField_3 = new JTextField();
      textField_3.setColumns(10);
      textField_3.setBounds(535, 116, 116, 24);
      getContentPane().add(textField_3);
      
      textField_4 = new JTextField();
      textField_4.setColumns(10);
      textField_4.setBounds(535, 163, 116, 24);
      getContentPane().add(textField_4);
      
      textField_5 = new JTextField();
      textField_5.setColumns(10);
      textField_5.setBounds(535, 214, 116, 24);
      getContentPane().add(textField_5);
      
      textField_6 = new JTextField();
      textField_6.setColumns(10);
      textField_6.setBounds(535, 264, 116, 24);
      getContentPane().add(textField_6);
      
      JButton button_2 = new JButton("장바구니담기");
      button_2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            try {
               Cart Ncart = new Cart(n,na,nb,nc);
               //integerparseint
               int proN = (int)textField_2.getText();
               System.out.println(proN);
               //객체생성하고 name = 필드이름. gettxt
            } catch (Exception e1) {
               // TODO Auto-generated catch block
               e1.printStackTrace();
            }
         }
      });
      button_2.setBounds(535, 315, 116, 27);
      getContentPane().add(button_2);
      
      JLabel label_4 = new JLabel("상점번호");
      label_4.setBounds(447, 217, 62, 18);
      getContentPane().add(label_4);
      
      
      setTable0();      
      setBounds(50, 50, 683, 637);      
   }
   private void setTable0() throws Exception {
      if (model !=null)
         model.setRowCount(0);
      getStoreProdList = spdao.getStoreProdList();
      if(getStoreProdList != null){
         int rows = getStoreProdList.size();
         Object[][] objs = new Object[rows][6];
         for(int i = 0; i<getStoreProdList.size();i++ ){
            objs[i][0] = getStoreProdList.get(i).getProdStore();
            objs[i][1] = getStoreProdList.get(i).getProdNum();
            objs[i][2] = getStoreProdList.get(i).getProdName();
            objs[i][3] = getStoreProdList.get(i).getPrice();
            objs[i][4] = getStoreProdList.get(i).getStock();
            objs[i][5] = getStoreProdList.get(i).getStoreNum();
         }
          model = new DefaultTableModel(objs,
                  new String[] {
                     "No.", "상품번호", "상품명", "가격", "재고","상점번호"
                  }
         );
         table.setModel(model);         
      }
   }
   private void setTable() throws Exception {
      if (model !=null)
         model.setRowCount(0);
      if(temp!=null)
         getStoreProdList = spdao.getStoreProdList2(Integer.parseInt(temp));
      if(getStoreProdList != null){
         int rows = getStoreProdList.size();
         Object[][] objs = new Object[rows][6];
         for(int i = 0; i<getStoreProdList.size();i++ ){
            objs[i][0] = getStoreProdList.get(i).getProdStore();
            objs[i][1] = getStoreProdList.get(i).getProdNum();
            objs[i][2] = getStoreProdList.get(i).getProdName();
            objs[i][3] = getStoreProdList.get(i).getPrice();
            objs[i][4] = getStoreProdList.get(i).getStock();
            objs[i][5] = getStoreProdList.get(i).getStoreNum();
         }
          model = new DefaultTableModel(objs,
                  new String[] {
                     "No.", "상품번호", "상품명", "가격", "재고","상점번호"
                  }
         );
         table.setModel(model);         
      }
   }
   
   @Override
   public void mouseClicked(MouseEvent e) {
      sp = getStoreProdList.get(table.getSelectedRow());      
      try {
         textField_2.setText(sp.getProdStore()+"");   
          textField_3.setText(sp.getProdNum()+"");              
          textField_4.setText(sp.getProdName()+"");
          textField_5.setText(sp.getStoreNum()+"");   
          textField_6.setText(sp.getPrice()+"");   
            
         } catch (Exception e1) {
            e1.printStackTrace();
         }
      
   }
   @Override
   public void mousePressed(MouseEvent e) {
      // TODO Auto-generated method stub
      
   }
   @Override
   public void mouseReleased(MouseEvent e) {
      // TODO Auto-generated method stub
      
   }
   @Override
   public void mouseEntered(MouseEvent e) {
      // TODO Auto-generated method stub
      
   }
   @Override
   public void mouseExited(MouseEvent e) {
      // TODO Auto-generated method stub
      
   }   
}