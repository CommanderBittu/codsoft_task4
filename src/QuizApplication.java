import java.util.*;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.Timer;
class Question {
    private String question;
    private ArrayList<String> options;
    private String correctAnswer;

    public Question(String question, String option1, String option2, String option3, String option4, String correctAnswer) {
        this.question = question;
        options = new ArrayList<>();
        options.add(option1);
        options.add(option2);
        options.add(option3);
        options.add(option4);
        this.correctAnswer = correctAnswer;
    }
    public String getQuestion() {
        return question;
    }

    public ArrayList<String> getOptions() {
        return options;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }
}

public class Quiz extends javax.swing.JFrame {
    ArrayList<Question> questions = new ArrayList<>();
    public Timer timer;
    public Quiz() {
        initComponents();
        questions.add(new Question("What is the chemical formulae for heavy water?",
                "h2o", "h2o2", "h3o", "c6h12o6", "h2o2"));
        questions.add(new Question("What is the largest mammal?",
                "Elephant", "Gorilla", "Blue Whale", "Cow", "Blue Whale"));
        questions.add(new Question("Which of the following is a nobel gas?",
                "Argon", "Oxygen", "Nitrogen", "sulphur", "Argon"));
        questions.add(new Question("What is the capital of Canada?",
                "New York", "Vancouver", "Toronto", "Ottawa", "Ottawa"));
        questions.add(new Question("Which of the following animal is an amphibians?",
                "Elephant", "Lion", "Salamander", "Eagle", "Salamander"));
        jLabel1.setText(questions.get(0).getQuestion());
        jRadioButton1.setText(questions.get(0).getOptions().get(0));
        jRadioButton2.setText(questions.get(0).getOptions().get(1));
        jRadioButton3.setText(questions.get(0).getOptions().get(2));
        jRadioButton4.setText(questions.get(0).getOptions().get(3));
        startTimer();
        jLabel3.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 150));
        setUndecorated(true);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("jLabel1");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jRadioButton1.setText("jRadioButton1");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jRadioButton2.setText("jRadioButton2");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jRadioButton3.setText("jRadioButton3");

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jRadioButton4.setText("jRadioButton4");

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("Next");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Time Left :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("jLabel3");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Quiz");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 308, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton4)
                            .addComponent(jRadioButton3)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(58, 58, 58))))
            .addGroup(layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(30, 30, 30)
                .addComponent(jRadioButton1)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton2)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton3)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton4)
                .addGap(43, 43, 43)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int a=JOptionPane.showConfirmDialog(null,"Do you really want to close the quiz?","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
            System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed
int score=0;
int QuestionPointer=1;
int OptionPointer=0;
int Pointer=0;
private void startTimer() {
    timer = new Timer(1000, new java.awt.event.ActionListener() {
        int secondsLeft = 10; // Change the value to set the timer duration

        @Override
        public void actionPerformed(java.awt.event.ActionEvent e) {
            jLabel2.setText("Time left: " + secondsLeft + " seconds");
            if (secondsLeft == 0) {
                ((Timer) e.getSource()).stop();
                advanceToNextQuestion();
            }
            secondsLeft--;
        }
    });
    timer.start();
}
private void advanceToNextQuestion()
{
    if(Pointer<questions.size()-1)
    {
        Pointer++;
        QuestionPointer++;
        jLabel1.setText(questions.get(Pointer).getQuestion());
        jRadioButton1.setText(questions.get(Pointer).getOptions().get(0));
        jRadioButton2.setText(questions.get(Pointer).getOptions().get(1));
        jRadioButton3.setText(questions.get(Pointer).getOptions().get(2));
        jRadioButton4.setText(questions.get(Pointer).getOptions().get(3));
        startTimer();
    }
    else{
        jRadioButton1.setVisible(false);
        jRadioButton2.setVisible(false);
        jRadioButton3.setVisible(false);
        jRadioButton4.setVisible(false);
        jLabel3.setText("Your Score is :"+score+""+questions.size());
        jLabel3.setVisible(true);
        jButton2.setEnabled(false);
    }
}
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    // Stop the timer
    timer.stop();

    // Check if any radio button is selected
    String selectedAnswer = getSelectedButtonText(buttonGroup1);
    if (selectedAnswer != null) {
        // Check the selected answer
        if (selectedAnswer.equals(questions.get(Pointer).getCorrectAnswer())) {
            score++;
        }

        // Increment Pointer only if it is within the bounds of the ArrayList
        if (Pointer < questions.size() - 1) {
            Pointer++;
        }

        // Increment QuestionPointer and update question and options
        if (QuestionPointer < questions.size()) {
            jLabel1.setText(questions.get(QuestionPointer).getQuestion());
            ArrayList<String> options = questions.get(QuestionPointer).getOptions();
            jRadioButton1.setText(options.get(0));
            jRadioButton2.setText(options.get(1));
            jRadioButton3.setText(options.get(2));
            jRadioButton4.setText(options.get(3));

            QuestionPointer++;

            // Restart the timer
            startTimer();
        } else {
            // Hide radio buttons and label
            jRadioButton1.setVisible(false);
            jRadioButton2.setVisible(false);
            jRadioButton3.setVisible(false);
            jRadioButton4.setVisible(false);
            jLabel1.setVisible(false);

            // Display score
            jLabel3.setText("Your Score is : "+score+" / "+questions.size());
            jLabel3.setVisible(true);

            // Disable next button
            jButton2.setEnabled(false);

            // Stop timer
            timer.stop();
        }
    } else {
        // If no answer is selected, display a message
        JOptionPane.showMessageDialog(this, "Please select an answer before proceeding to the next question.");
    }   
    }//GEN-LAST:event_jButton2ActionPerformed
      public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Quiz().setVisible(true);
            }
        });
    }
    String getSelectedButtonText(ButtonGroup buttonGroup) {
    for (Enumeration buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
        AbstractButton button = (AbstractButton) buttons.nextElement();

        if (button.isSelected()) {
            return button.getText();
        }
    }

    return null;
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    // End of variables declaration//GEN-END:variables
}
