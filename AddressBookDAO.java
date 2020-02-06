/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.dao;

import mvc.models.Person;

import mvc.views.DetailViewPanel;
import mvc.views.NameListPanel;
import  javax.swing.DefaultListModel;

/**
 *
 * @author Admin
 */
public interface AddressBookDAO{
   
    
  
    public void addPerson(Person person);
    public void removePerson(String name);
    public void updatePerson(Person person,String name);
    public DefaultListModel getAllNames(NameListPanel namePanel);
    public void getSelectedName(DetailViewPanel detailPanel,String selectedName);
    
}
