package Jamiul_Huda.InsuranceAgentControllers;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;



public class ReviewTrackerController {


    // ================= HEADER =================


    @FXML
    private Label dashboardTitleLabel;


    @FXML
    private Label agentNameLabel;



    // ================= SEARCH =================


    @FXML
    private TextField applicationIdTextField;


    @FXML
    private Button searchButton;




    // ================= TABLE =================


    @FXML
    private TableView<ReviewApplication> reviewTableView;


    @FXML
    private TableColumn<ReviewApplication, String> applicationIdColumn;


    @FXML
    private TableColumn<ReviewApplication, String> customerNameColumn;


    @FXML
    private TableColumn<ReviewApplication, String> submissionDateColumn;


    @FXML
    private TableColumn<ReviewApplication, String> currentStatusColumn;


    @FXML
    private TableColumn<ReviewApplication, String> underwriterNotesColumn;




    // ================= STATUS =================


    @FXML
    private TextField selectedStatusTextField;


    @FXML
    private Label notificationLabel;



    private ObservableList<ReviewApplication> applicationList;




    // ================= INITIALIZE =================


    @FXML
    public void initialize(){


        agentNameLabel.setText("Insurance Agent");


        applicationList = FXCollections.observableArrayList();



        /*
         Temporary sample data.
         Later replace this with database data.
        */


        applicationList.add(
                new ReviewApplication(
                        "APP001",
                        "Rahim Ahmed",
                        "06-08-2026",
                        "Pending",
                        "Documents checking"
                )
        );


        applicationList.add(
                new ReviewApplication(
                        "APP002",
                        "Karim Hasan",
                        "05-08-2026",
                        "Approved",
                        "Ready for policy issue"
                )
        );



        applicationIdColumn.setCellValueFactory(
                data -> data.getValue().applicationIdProperty()
        );


        customerNameColumn.setCellValueFactory(
                data -> data.getValue().customerNameProperty()
        );


        submissionDateColumn.setCellValueFactory(
                data -> data.getValue().submissionDateProperty()
        );


        currentStatusColumn.setCellValueFactory(
                data -> data.getValue().currentStatusProperty()
        );


        underwriterNotesColumn.setCellValueFactory(
                data -> data.getValue().underwriterNotesProperty()
        );



        reviewTableView.setItems(applicationList);



        reviewTableView.getSelectionModel()
                .selectedItemProperty()
                .addListener(
                        (observable, oldValue, newValue) -> {


                            if(newValue != null){

                                selectedStatusTextField.setText(
                                        newValue.getCurrentStatus()
                                );


                            }


                        }
                );


        notificationLabel.setText(
                "Ready"
        );


    }





    // ================= SEARCH =================


    @FXML
    private void search(ActionEvent event){


        String id =
                applicationIdTextField.getText();



        if(id.isEmpty()){


            notificationLabel.setText(
                    "Enter Application ID"
            );


            return;

        }



        for(ReviewApplication app : applicationList){


            if(app.getApplicationId()
                    .equalsIgnoreCase(id)){



                reviewTableView
                        .getSelectionModel()
                        .select(app);



                notificationLabel.setText(
                        "Application Found"
                );


                return;


            }


        }



        notificationLabel.setText(
                "Application Not Found"
        );


    }





    // ================= REFRESH =================


    @FXML
    private void refresh(ActionEvent event){



        /*
        Later:
        Load latest data from database
        */


        reviewTableView.refresh();


        notificationLabel.setText(
                "Review Tracker Updated"
        );


    }





    // ================= CLEAR =================


    @FXML
    private void clear(ActionEvent event){


        applicationIdTextField.clear();


        selectedStatusTextField.clear();


        reviewTableView
                .getSelectionModel()
                .clearSelection();



        notificationLabel.setText(
                "Cleared"
        );


    }






    // ================= DASHBOARD =================


    @FXML
    private void openDashboard(ActionEvent event){


        switchScene(
                event,
                "/Jamiul_Huda/InsuranceAgentViews/InsuranceAgentDashboard.fxml"
        );


    }






    // ================= BACK =================


    @FXML
    private void back(ActionEvent event){


        switchScene(
                event,
                "/Jamiul_Huda/InsuranceAgentViews/InsuranceAgentDashboard.fxml"
        );


    }





    // ================= LOGOUT =================


    @FXML
    private void logout(ActionEvent event){


        switchScene(
                event,
                "/Jamiul_Huda/InsuranceAgentViews/Login.fxml"
        );


    }





    // ================= SCENE SWITCH =================


    private void switchScene(
            ActionEvent event,
            String file){


        try{


            Parent root =
                    FXMLLoader.load(
                            getClass()
                                    .getResource(file)
                    );


            Stage stage =
                    (Stage)((Node)event.getSource())
                            .getScene()
                            .getWindow();



            stage.setScene(
                    new Scene(root)
            );


            stage.show();


        }
        catch(IOException e){


            e.printStackTrace();


        }


    }





    // ================= TEMP MODEL =================


    public static class ReviewApplication {


        private final javafx.beans.property.SimpleStringProperty applicationId;

        private final javafx.beans.property.SimpleStringProperty customerName;

        private final javafx.beans.property.SimpleStringProperty submissionDate;

        private final javafx.beans.property.SimpleStringProperty currentStatus;

        private final javafx.beans.property.SimpleStringProperty underwriterNotes;




        public ReviewApplication(
                String applicationId,
                String customerName,
                String submissionDate,
                String currentStatus,
                String underwriterNotes){


            this.applicationId =
                    new javafx.beans.property.SimpleStringProperty(applicationId);


            this.customerName =
                    new javafx.beans.property.SimpleStringProperty(customerName);


            this.submissionDate =
                    new javafx.beans.property.SimpleStringProperty(submissionDate);


            this.currentStatus =
                    new javafx.beans.property.SimpleStringProperty(currentStatus);


            this.underwriterNotes =
                    new javafx.beans.property.SimpleStringProperty(underwriterNotes);


        }




        public String getApplicationId(){

            return applicationId.get();

        }


        public String getCurrentStatus(){

            return currentStatus.get();

        }



        public javafx.beans.property.StringProperty applicationIdProperty(){

            return applicationId;

        }


        public javafx.beans.property.StringProperty customerNameProperty(){

            return customerName;

        }


        public javafx.beans.property.StringProperty submissionDateProperty(){

            return submissionDate;

        }


        public javafx.beans.property.StringProperty currentStatusProperty(){

            return currentStatus;

        }


        public javafx.beans.property.StringProperty underwriterNotesProperty(){

            return underwriterNotes;

        }


    }


}