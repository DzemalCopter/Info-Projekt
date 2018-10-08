package model.DealerQuiz;

public class LevelQuestions {

    private Question[] questions;
    private String[] answers;
    private String question;
    private String correctAnswer;

    public LevelQuestions(int level) {
        createQuestions(level);
    }

    private void createQuestions(int level){
        answers = new String[4];
        switch(level){
            case 1: questions = new Question[2];
                questions[0] = new Question("Wie hält man eine Waffe?",new String[]{"Mit den Füßen","Mit dem Mund","Mit dem Händen","Garnicht"},"C" );
                questions[1] = new Question("",new String[]{"","KKG","HHG","MKG"},"B" );
                break;
            case 2: questions = new Question[3];
                questions[0] = new Question("Welches Land regiert Donald T.?",new String[]{"Entenhausen","USA","Deutschland","Mexico"},"B" );
                questions[1] = new Question("In welchem Bundesland liegt Freiburg?",new String[]{"Mallorca","Bayern","Baden-Württemberg","Deutschland"},"C" );
                questions[2] = new Question("Wann fand die Völkerschlacht von Leipzig statt? ",new String[]{"1813","1933","2009","1412"},"A" );
                break;
            case 3: questions = new Question[1];
                questions[0] = new Question("Welche Säure ist HCL",new String[]{"Salpetersäure","Schwefelsäure","Salzsäure","Ameisensäure"},"C" );

                break;
            case 4:
               questions = new Question[2];
                questions[0] = new Question("Wo fanden die olympischen Winterspiele 2018 statt? ",new String[]{"Tokyo","Kuala Lumpur","Stalingrad","Pyeongchang "},"D" );
                questions[1] = new Question("Bei welchem Elektronegativitätswert findet eine polare Bindung statt ",new String[]{">0,4","<1,7",">1,7","1,5 "},"A" );
                break;
            case 5:
                questions = new Question[1];
                questions[0] = new Question("Wer hat Downietown Adventures programmiert? ",new String[]{"Keiner","Ibrahim & Felix & Timo & Markus ","Nur Ibrahim mit einer Hand"," Nur Markus"},"C" );


        }
    }

    public Question getRandomQuestion(){
        int r= (int) (Math.random()*questions.length);
        return questions[r];
    }
}