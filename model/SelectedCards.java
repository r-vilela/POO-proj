package model;

public static class SelectedCards{
    private static Card selectedCard = null;

    public static Card getSelectedCard(){
        return this.SelectedCard;
    }

    public static Boolean isSelectCard(Card crd){
        if(selectedCard == null){
            this.setSelectedCard(crd);

            return false;
        }else{
            return true
        }
    }

    public static void setSelectedCard(Card crd){
        this.selectedCard = crd;

    }
}
