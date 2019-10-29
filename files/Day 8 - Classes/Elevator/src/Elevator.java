public class Elevator {
    public int maxFloors;
    public int currentFloor;
    public int numPeople;
    public double weightLimit;
    public double currentWeight;
    public String manufacturingCompany;
    public double cost;

    public Elevator(int maxFloors, double weightLimit, String manufacturingCompany, double cost) {
        this.maxFloors = maxFloors;
        this.weightLimit = weightLimit;
        this.manufacturingCompany = manufacturingCompany;
        this.cost = cost;

        this.currentFloor = 0;
        this.numPeople = 0;
        this.currentWeight = 0;
    }

    public int getMaxFloors() {
        return maxFloors;
    }

    public void setMaxFloors(int maxFloors) {
        this.maxFloors = maxFloors;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public int getNumPeople() {
        return numPeople;
    }

    public void setNumPeople(int numPeople) {
        this.numPeople = numPeople;
    }

    public double getWeightLimit() {
        return weightLimit;
    }

    public void setWeightLimit(double weightLimit) {
        this.weightLimit = weightLimit;
    }

    public double getCurrentWeight() {
        return currentWeight;
    }

    public void setCurrentWeight(double currentWeight) {
        this.currentWeight = currentWeight;
    }

    public String getManufacturingCompany() {
        return manufacturingCompany;
    }

    public void setManufacturingCompany(String manufacturingCompany) {
        this.manufacturingCompany = manufacturingCompany;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String addPerson(double weight){
        if(currentWeight + weight + 100 > weightLimit){
            return "Cannot add person. Too much weight.";
        }
        else{
            numPeople++;
            currentWeight += weight;
            return "Added person.";

        }
    }

    public String upFloor(){
        if(currentFloor+1 > maxFloors){
            return "Cannot go up anymore. Max floor reached.";
        }
        else{
            currentFloor++;
            return "Up 1 floor. You are on floor " + currentFloor;
        }
    }
    public String downFloor(){
        if(currentFloor-1 < 0){
            return "Cannot go down anymore.";
        }
        else{
            currentFloor--;
            return "Down 1 floor. You are on floor " + currentFloor;
        }
    }

}
