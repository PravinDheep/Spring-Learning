/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pravin.learning.messenger.service;

import java.util.ArrayList;
import java.util.List;
import org.pravin.learning.messenger.model.Message;

/**
 *
 * @author Pradeep
 */
public class MessageService {
    
    public List<Message> getAllMessages(){
        Message m1 = new Message(1L,"Hello Jersey","Pravin");
        Message m2 = new Message(2L,"Hello RestEasy","Pravin");
        List<Message> li = new ArrayList<>();
        li.add(m1);
        li.add(m2);
        return li;
    }
}
