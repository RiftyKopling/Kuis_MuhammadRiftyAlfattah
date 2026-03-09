/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuis_123230093;
import exception.InvalidRosterException;
/**
 *
 * @author Lab Informatika
 */
public abstract class Team {
    private String teamName;
    private int totalPoints;
    
    public void setName(String name){
        this.teamName = name;
    }
    
    public String getName(){
        return this.teamName;
    }
    
    public void setPoint(int point) throws IllegalArgumentException{
        if(point < 0){
            throw new IllegalArgumentException("Poin tidak boleh minus!");
        }
        this.totalPoints = point; 
    }
    
    public int getPoint(){
        return this.totalPoints;
    }
    
    public abstract void calculateBonus();
    public abstract void validateRoster() throws InvalidRosterException;
    public abstract void prepareArena();
}
