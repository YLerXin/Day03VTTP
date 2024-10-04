package first;

public class Box implements Damagable {

    private int integrity;

    public int getIntegrity() {
        return integrity;
    }
    public void setIntegrity(int integrity) {
        this.integrity = integrity;
    }
    public void damage(int damage){
        integrity -= damage;
    }
    public int getDamage(){
        return this.integrity;
    }
    
}
