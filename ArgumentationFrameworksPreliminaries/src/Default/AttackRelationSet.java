package Default;

import java.util.ArrayList;

public class AttackRelationSet {
    private ArrayList<AttackRelation>  attackRelations;

    public AttackRelationSet(){
        attackRelations = new ArrayList<AttackRelation>();
    }
    public ArgumentNode getAttackerOf(ArgumentNode victim){
        ArgumentNode attacker = null;
        for(AttackRelation r : attackRelations){
            if(r.getValue().equals(victim)) attacker = r.getKey();
        }
        return attacker;
    }

    public boolean hasRelation(AttackRelation a){

        return attackRelations.contains(a);
    }
}
