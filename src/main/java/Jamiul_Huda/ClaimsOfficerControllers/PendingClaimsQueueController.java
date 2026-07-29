package Jamiul_Huda.ClaimsOfficerControllers;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Comparator;



public class PendingClaimsQueueController {


    @FXML
    private TableView<Claim> claimsTable;


    @FXML
    private TableColumn<Claim, String> tokenColumn;


    @FXML
    private TableColumn<Claim, String> dateColumn;


    @FXML
    private TableColumn<Claim, String> coverageColumn;


    @FXML
    private TableColumn<Claim, String> urgencyColumn;


    @FXML
    private TableColumn<Claim, Number> amountColumn;


    @FXML
    private TableColumn<Claim, String> statusColumn;



    private ObservableList<Claim> claimList =
            FXCollections.observableArrayList();



    @FXML
    public void initialize(){


        tokenColumn.setCellValueFactory(
                data -> data.getValue().tokenProperty()
        );


        dateColumn.setCellValueFactory(
                data -> data.getValue().dateProperty()
        );


        coverageColumn.setCellValueFactory(
                data -> data.getValue().coverageProperty()
        );


        urgencyColumn.setCellValueFactory(
                data -> data.getValue().urgencyProperty()
        );


        amountColumn.setCellValueFactory(
                data -> data.getValue().amountProperty()
        );


        statusColumn.setCellValueFactory(
                data -> data.getValue().statusProperty()
        );


        loadPendingClaims();

    }





    @FXML
    public void loadPendingClaims(){


        claimList.clear();


        claimList.add(
                new Claim(
                        "CLM-1001",
                        "2026-07-01",
                        "Life Coverage - Death Benefit",
                        "High",
                        500000,
                        "Submitted - Pending Examination"
                )
        );


        claimList.add(
                new Claim(
                        "CLM-1002",
                        "2026-07-05",
                        "Medical Insurance Coverage",
                        "Medium",
                        150000,
                        "Submitted - Pending Examination"
                )
        );


        claimList.add(
                new Claim(
                        "CLM-1003",
                        "2026-07-10",
                        "Critical Illness Coverage",
                        "Low",
                        80000,
                        "Submitted - Pending Examination"
                )
        );


        claimsTable.setItems(claimList);

    }





    @FXML
    public void sortByUrgency(){


        claimList.sort(
                Comparator.comparing(
                        Claim::getUrgencyOrder
                )
        );


        claimsTable.refresh();

    }





    @FXML
    public void sortByDate(){


        claimList.sort(
                Comparator.comparing(
                        Claim::getDate
                )
        );


        claimsTable.refresh();

    }





    @FXML
    public void sortByAmount(){


        claimList.sort(
                Comparator.comparingDouble(
                        Claim::getAmount
                ).reversed()
        );


        claimsTable.refresh();

    }





    @FXML
    public void backDashboard(ActionEvent event)
            throws IOException {


        Parent root =
                FXMLLoader.load(
                        getClass()
                                .getResource(
                                        "/FXML/ClaimsOfficerDashboard.fxml"
                                )
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

}