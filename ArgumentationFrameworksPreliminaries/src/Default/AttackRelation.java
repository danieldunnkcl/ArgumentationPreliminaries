package Default;

import javafx.util.Pair;

public class AttackRelation extends Pair{


    public AttackRelation(ArgumentNode key, ArgumentNode value) {
        super(key, value);
    }

    @Override
    public ArgumentNode getKey() {
        return (ArgumentNode)super.getKey();
    }
}
