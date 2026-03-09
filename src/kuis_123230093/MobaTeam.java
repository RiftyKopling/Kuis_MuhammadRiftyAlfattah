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
public class MobaTeam extends Team implements Playable{
   int playerCounts;
   
   public void setPlayerCount(int playerCount){
    this.playerCounts = playerCount;
    }
   
   @Override
   public void calculateBonus(){
       if (getPoint() > 50){
           System.out.println("Bonus MOBA: Skin Eksklusif untuk " + getName());
       }
   }
   
   @Override
   public void validateRoster() throws InvalidRosterException{
       if(this.playerCounts != 5){
           throw new InvalidRosterException("Anggota Roster harus tepat 5 orang!, ");
       }
       System.out.println("Team sesuai");
   }
   
   @Override
   public void prepareArena(){
       System.out.println("Mempersiapkan Arena MOBA 5v5 untuk tim " +
getName());
   }
   
   @Override
   public void joinMatch(String matchId){
       System.out.println(getName() + " BERGABUNG DI PERTANDINGAN " + matchId);
   }
    
   
    
    
}
