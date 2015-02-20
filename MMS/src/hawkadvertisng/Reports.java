
package hawkadvertisng;

import javax.swing.JOptionPane;


public class Reports extends javax.swing.JPanel {

    
    MainWindow Home;
    String Colum;
    private String media="n_ro";
    private String month;
    private String searchIn;
    private boolean isNReport;
    private String code;
    private String mediaType="newspaper";
    private String media2;
    private String reportName;
    private String mediaName;
    String queryStart ,queryEnd[],join="",deductionQuery[],deductJoin;
    
    public Reports(MainWindow Home) {
        initComponents();
        this.Home=Home;
        MonthPop.setVisible(false);
        MonthPop1.setVisible(false);
        MediaPop.setVisible(false);
        CityPop.setVisible(false);
        allmediaCityPop1.setVisible(false);
        isNReport=true;
        queryStart= "Select r.RONum as `Release Order`,r.date as `R.O. Date`,"
                + "r.CBill as `BillNo.`,r.cbillDate as `Client Bill Date`,"
                + "r.amount as `Amount`,r.cname as `CustomerName`,"
                + "r.MName as `Manager Name`,r.mstation as `Station`,"
                + "ifnull(n.amount,0) as `NewsBillAmount`,"
                + "ifnull(commision,0) as `Commision%` ";
       queryEnd= new String[]{" left join `nbill` n on r.ronum = n.ronum ",
                                    "  left join `mbill` n on r.ronum = n.ronum "};
              
      deductionQuery= new String[]
      {"select sum(c.deduction) from cbill c where billno in (select distinct(cbill) from n_ro r ",
      "select sum(c.deduction) from ecbill c where billno in (select distinct(cbill) from e_ro r ",
      "select ifnull(sum(c.deduction),0) from cbill c where billno in (select distinct(`Bill No.`) from allreportsview r ",
      "select ifnull(sum(c.deduction),0) from ecbill c where billno in (select distinct(`Bill No.`) from allemediareportsview r ",
      "select ifnull(sum(c.deduction),0) from cbill c where billno in (select distinct(`Bill No.`) from recievedbill r ",
      "select ifnull(sum(c.deduction),0) from ecbill c where billno in (select distinct(`Bill No.`) from emediabills r "
      };
     deductJoin= deductionQuery[0];   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        allmediaCityPop1 = new javax.swing.JPanel();
        cityName1 = new javax.swing.JTextField();
        citySearch1 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        NewsEmediapanel = new javax.swing.JPanel();
        NMonth = new javax.swing.JButton();
        All = new javax.swing.JButton();
        Generate1 = new javax.swing.JButton();
        UnGenerated1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        NName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        NCode = new javax.swing.JTextField();
        NCodeSearch = new javax.swing.JButton();
        newsR = new javax.swing.JRadioButton();
        mediaR = new javax.swing.JRadioButton();
        All1 = new javax.swing.JButton();
        MonthPop = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        MediaPop3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        PCode3 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        PName3 = new javax.swing.JTextField();
        Nsearch3 = new javax.swing.JButton();
        monthBox = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        year = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        MonthPop1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        MediaPop4 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        PCode4 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        PName4 = new javax.swing.JTextField();
        Nsearch4 = new javax.swing.JButton();
        monthBox1 = new javax.swing.JComboBox();
        jLabel19 = new javax.swing.JLabel();
        year1 = new javax.swing.JComboBox();
        jButton4 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        CityPop = new javax.swing.JPanel();
        cityName = new javax.swing.JTextField();
        jButton12 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        citySearch = new javax.swing.JButton();
        MediaPop = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        PCode = new javax.swing.JTextField();
        PName = new javax.swing.JTextField();
        Nsearch = new javax.swing.JButton();
        mediaSearch = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        CustomerPanel = new javax.swing.JPanel();
        Month = new javax.swing.JButton();
        News = new javax.swing.JButton();
        AllNS = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Nametxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Codetxt = new javax.swing.JTextField();
        Search = new javax.swing.JButton();
        Media = new javax.swing.JButton();
        AllEmedia = new javax.swing.JButton();
        Month1 = new javax.swing.JButton();
        home = new javax.swing.JLabel();
        hawklogo = new javax.swing.JLabel();
        ROPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        home1 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        buttonGroup1.add(newsR);
        buttonGroup1.add(mediaR);

        setLayout(null);

        allmediaCityPop1.setBackground(new java.awt.Color(255, 255, 255));
        allmediaCityPop1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        allmediaCityPop1.setForeground(new java.awt.Color(255, 255, 255));
        allmediaCityPop1.setMaximumSize(new java.awt.Dimension(380, 90));
        allmediaCityPop1.setLayout(null);
        allmediaCityPop1.add(cityName1);
        cityName1.setBounds(50, 20, 150, 20);

        citySearch1.setText("OK");
        citySearch1.setOpaque(false);
        citySearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                citySearch1ActionPerformed(evt);
            }
        });
        allmediaCityPop1.add(citySearch1);
        citySearch1.setBounds(130, 50, 73, 23);

        jButton13.setText("Cancel");
        jButton13.setOpaque(false);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        allmediaCityPop1.add(jButton13);
        jButton13.setBounds(40, 50, 80, 23);

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Name:");
        allmediaCityPop1.add(jLabel21);
        jLabel21.setBounds(10, 10, 40, 40);

        add(allmediaCityPop1);
        allmediaCityPop1.setBounds(640, 560, 240, 90);

        NewsEmediapanel.setBackground(new java.awt.Color(100, 100, 100));
        NewsEmediapanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        NewsEmediapanel.setForeground(new java.awt.Color(100, 100, 100));
        NewsEmediapanel.setMaximumSize(new java.awt.Dimension(360, 280));
        NewsEmediapanel.setOpaque(false);
        NewsEmediapanel.setPreferredSize(new java.awt.Dimension(360, 280));
        NewsEmediapanel.setLayout(null);

        NMonth.setText("By Month ");
        NMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NMonthActionPerformed(evt);
            }
        });
        NewsEmediapanel.add(NMonth);
        NMonth.setBounds(20, 150, 130, 23);

        All.setText("All Release Orders");
        All.setOpaque(false);
        All.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllActionPerformed(evt);
            }
        });
        NewsEmediapanel.add(All);
        All.setBounds(20, 190, 130, 23);

        Generate1.setText("Received Bills ");
        Generate1.setOpaque(false);
        Generate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Generate1ActionPerformed(evt);
            }
        });
        NewsEmediapanel.add(Generate1);
        Generate1.setBounds(160, 150, 130, 23);

        UnGenerated1.setText("Unreceived Bills");
        UnGenerated1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnGenerated1ActionPerformed(evt);
            }
        });
        NewsEmediapanel.add(UnGenerated1);
        UnGenerated1.setBounds(160, 190, 130, 23);

        jLabel6.setText(" Name:");
        NewsEmediapanel.add(jLabel6);
        jLabel6.setBounds(10, 60, 40, 14);

        NName.setEditable(false);
        NName.setMaximumSize(new java.awt.Dimension(130, 20));
        NName.setMinimumSize(new java.awt.Dimension(130, 20));
        NName.setPreferredSize(new java.awt.Dimension(130, 20));
        NewsEmediapanel.add(NName);
        NName.setBounds(50, 60, 130, 20);

        jLabel7.setText(" Code:");
        NewsEmediapanel.add(jLabel7);
        jLabel7.setBounds(10, 90, 40, 14);

        NCode.setEditable(false);
        NCode.setMaximumSize(new java.awt.Dimension(130, 20));
        NCode.setMinimumSize(new java.awt.Dimension(130, 20));
        NCode.setPreferredSize(new java.awt.Dimension(130, 20));
        NewsEmediapanel.add(NCode);
        NCode.setBounds(50, 90, 130, 20);

        NCodeSearch.setText("Search");
        NCodeSearch.setOpaque(false);
        NCodeSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NCodeSearchActionPerformed(evt);
            }
        });
        NewsEmediapanel.add(NCodeSearch);
        NCodeSearch.setBounds(190, 90, 80, 23);

        newsR.setSelected(true);
        newsR.setText("Newspaper Reports");
        newsR.setOpaque(false);
        newsR.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                newsRItemStateChanged(evt);
            }
        });
        NewsEmediapanel.add(newsR);
        newsR.setBounds(190, 30, 150, 23);

        mediaR.setText("EMedia Reports");
        mediaR.setOpaque(false);
        mediaR.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                mediaRItemStateChanged(evt);
            }
        });
        mediaR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mediaRActionPerformed(evt);
            }
        });
        NewsEmediapanel.add(mediaR);
        mediaR.setBounds(190, 50, 150, 23);

        All1.setText("Station-wise");
        All1.setOpaque(false);
        All1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                All1ActionPerformed(evt);
            }
        });
        NewsEmediapanel.add(All1);
        All1.setBounds(90, 230, 130, 23);

        add(NewsEmediapanel);
        NewsEmediapanel.setBounds(10, 160, 360, 280);

        MonthPop.setBackground(new java.awt.Color(255, 255, 255));
        MonthPop.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        MonthPop.setMaximumSize(new java.awt.Dimension(380, 90));
        MonthPop.setMinimumSize(new java.awt.Dimension(380, 90));
        MonthPop.setLayout(null);

        jLabel9.setText("Month:");
        MonthPop.add(jLabel9);
        jLabel9.setBounds(10, 10, 50, 40);

        MediaPop3.setBackground(new java.awt.Color(25, 31, 36));
        MediaPop3.setLayout(null);

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Code:");
        MediaPop3.add(jLabel10);
        jLabel10.setBounds(150, 20, 40, 40);

        PCode3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PCode3ActionPerformed(evt);
            }
        });
        MediaPop3.add(PCode3);
        PCode3.setBounds(190, 30, 90, 20);

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Name:");
        MediaPop3.add(jLabel11);
        jLabel11.setBounds(10, 20, 40, 40);
        MediaPop3.add(PName3);
        PName3.setBounds(50, 30, 90, 20);

        Nsearch3.setText("S");
        Nsearch3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nsearch3ActionPerformed(evt);
            }
        });
        MediaPop3.add(Nsearch3);
        Nsearch3.setBounds(290, 30, 40, 23);

        MonthPop.add(MediaPop3);
        MediaPop3.setBounds(470, 150, 380, 110);

        monthBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec", " " }));
        monthBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                monthBoxItemStateChanged(evt);
            }
        });
        MonthPop.add(monthBox);
        monthBox.setBounds(60, 20, 70, 20);

        jLabel8.setText("Year:");
        MonthPop.add(jLabel8);
        jLabel8.setBounds(150, 20, 40, 20);

        year.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));
        MonthPop.add(year);
        year.setBounds(180, 20, 49, 20);

        jButton2.setText("OK");
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        MonthPop.add(jButton2);
        jButton2.setBounds(80, 50, 73, 23);

        jButton8.setText("Cancel");
        jButton8.setOpaque(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        MonthPop.add(jButton8);
        jButton8.setBounds(160, 50, 73, 23);

        add(MonthPop);
        MonthPop.setBounds(380, 560, 240, 90);

        MonthPop1.setBackground(new java.awt.Color(255, 255, 255));
        MonthPop1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        MonthPop1.setForeground(new java.awt.Color(255, 255, 255));
        MonthPop1.setMaximumSize(new java.awt.Dimension(380, 90));
        MonthPop1.setMinimumSize(new java.awt.Dimension(380, 90));
        MonthPop1.setLayout(null);

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Month:");
        MonthPop1.add(jLabel16);
        jLabel16.setBounds(10, 0, 50, 40);

        MediaPop4.setBackground(new java.awt.Color(25, 31, 36));
        MediaPop4.setLayout(null);

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Code:");
        MediaPop4.add(jLabel17);
        jLabel17.setBounds(150, 20, 40, 40);

        PCode4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PCode4ActionPerformed(evt);
            }
        });
        MediaPop4.add(PCode4);
        PCode4.setBounds(190, 30, 90, 20);

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Name:");
        MediaPop4.add(jLabel18);
        jLabel18.setBounds(10, 20, 40, 40);
        MediaPop4.add(PName4);
        PName4.setBounds(50, 30, 90, 20);

        Nsearch4.setText("S");
        Nsearch4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nsearch4ActionPerformed(evt);
            }
        });
        MediaPop4.add(Nsearch4);
        Nsearch4.setBounds(290, 30, 40, 23);

        MonthPop1.add(MediaPop4);
        MediaPop4.setBounds(470, 150, 380, 110);

        monthBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec", " " }));
        monthBox1.setOpaque(false);
        monthBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                monthBox1ItemStateChanged(evt);
            }
        });
        MonthPop1.add(monthBox1);
        monthBox1.setBounds(60, 10, 70, 20);

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Year:");
        MonthPop1.add(jLabel19);
        jLabel19.setBounds(150, 10, 40, 20);

        year1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));
        year1.setOpaque(false);
        MonthPop1.add(year1);
        year1.setBounds(180, 10, 49, 20);

        jButton4.setText("OK");
        jButton4.setOpaque(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        MonthPop1.add(jButton4);
        jButton4.setBounds(80, 40, 73, 23);

        jButton10.setText("Cancel");
        jButton10.setOpaque(false);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        MonthPop1.add(jButton10);
        jButton10.setBounds(160, 40, 73, 23);

        add(MonthPop1);
        MonthPop1.setBounds(380, 660, 240, 90);

        CityPop.setBackground(new java.awt.Color(255, 255, 255));
        CityPop.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        CityPop.setForeground(new java.awt.Color(255, 255, 255));
        CityPop.setMaximumSize(new java.awt.Dimension(380, 90));
        CityPop.setLayout(null);
        CityPop.add(cityName);
        cityName.setBounds(50, 20, 150, 20);

        jButton12.setText("Cancel");
        jButton12.setOpaque(false);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        CityPop.add(jButton12);
        jButton12.setBounds(40, 50, 80, 23);

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Name:");
        CityPop.add(jLabel20);
        jLabel20.setBounds(10, 10, 40, 40);

        citySearch.setText("OK");
        citySearch.setOpaque(false);
        citySearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                citySearchActionPerformed(evt);
            }
        });
        CityPop.add(citySearch);
        citySearch.setBounds(140, 50, 73, 23);

        add(CityPop);
        CityPop.setBounds(380, 450, 240, 90);

        MediaPop.setBackground(new java.awt.Color(255, 255, 255));
        MediaPop.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        MediaPop.setForeground(new java.awt.Color(255, 255, 255));
        MediaPop.setMaximumSize(new java.awt.Dimension(380, 90));
        MediaPop.setLayout(null);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Code:");
        MediaPop.add(jLabel2);
        jLabel2.setBounds(10, 40, 40, 40);

        PCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PCodeActionPerformed(evt);
            }
        });
        MediaPop.add(PCode);
        PCode.setBounds(50, 50, 150, 20);
        MediaPop.add(PName);
        PName.setBounds(50, 20, 150, 20);

        Nsearch.setText("Search");
        Nsearch.setOpaque(false);
        Nsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NsearchActionPerformed(evt);
            }
        });
        MediaPop.add(Nsearch);
        Nsearch.setBounds(210, 20, 70, 23);

        mediaSearch.setText("OK");
        mediaSearch.setOpaque(false);
        mediaSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mediaSearchActionPerformed(evt);
            }
        });
        MediaPop.add(mediaSearch);
        mediaSearch.setBounds(210, 50, 73, 23);

        jButton9.setText("Cancel");
        jButton9.setOpaque(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        MediaPop.add(jButton9);
        jButton9.setBounds(290, 50, 70, 23);

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Name:");
        MediaPop.add(jLabel15);
        jLabel15.setBounds(10, 10, 40, 40);

        add(MediaPop);
        MediaPop.setBounds(630, 450, 370, 90);

        CustomerPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        CustomerPanel.setMaximumSize(new java.awt.Dimension(360, 280));
        CustomerPanel.setOpaque(false);
        CustomerPanel.setLayout(null);

        Month.setText("By Month Newspaper");
        Month.setOpaque(false);
        Month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MonthActionPerformed(evt);
            }
        });
        CustomerPanel.add(Month);
        Month.setBounds(190, 140, 150, 23);

        News.setText("By NewsPapper");
        News.setOpaque(false);
        News.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewsActionPerformed(evt);
            }
        });
        CustomerPanel.add(News);
        News.setBounds(190, 180, 150, 23);

        AllNS.setText("All Newspaper R.O.");
        AllNS.setOpaque(false);
        AllNS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllNSActionPerformed(evt);
            }
        });
        CustomerPanel.add(AllNS);
        AllNS.setBounds(190, 220, 150, 23);

        jLabel3.setText("Customer Name:");
        CustomerPanel.add(jLabel3);
        jLabel3.setBounds(10, 50, 80, 14);

        Nametxt.setEditable(false);
        Nametxt.setMaximumSize(new java.awt.Dimension(130, 20));
        Nametxt.setMinimumSize(new java.awt.Dimension(130, 20));
        Nametxt.setPreferredSize(new java.awt.Dimension(130, 20));
        CustomerPanel.add(Nametxt);
        Nametxt.setBounds(100, 50, 130, 20);

        jLabel4.setText("Code:");
        CustomerPanel.add(jLabel4);
        jLabel4.setBounds(10, 80, 29, 20);

        Codetxt.setEditable(false);
        Codetxt.setMaximumSize(new java.awt.Dimension(130, 20));
        Codetxt.setMinimumSize(new java.awt.Dimension(130, 20));
        Codetxt.setPreferredSize(new java.awt.Dimension(130, 20));
        CustomerPanel.add(Codetxt);
        Codetxt.setBounds(100, 80, 130, 20);

        Search.setText("Search");
        Search.setOpaque(false);
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });
        CustomerPanel.add(Search);
        Search.setBounds(240, 80, 80, 23);

        Media.setText("By Electronic Media");
        Media.setOpaque(false);
        Media.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MediaActionPerformed(evt);
            }
        });
        CustomerPanel.add(Media);
        Media.setBounds(10, 180, 160, 23);

        AllEmedia.setText("All EMedia R.O.");
        AllEmedia.setOpaque(false);
        AllEmedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllEmediaActionPerformed(evt);
            }
        });
        CustomerPanel.add(AllEmedia);
        AllEmedia.setBounds(10, 220, 160, 23);

        Month1.setText("By Month EMedia");
        Month1.setOpaque(false);
        Month1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Month1ActionPerformed(evt);
            }
        });
        CustomerPanel.add(Month1);
        Month1.setBounds(10, 140, 160, 23);

        add(CustomerPanel);
        CustomerPanel.setBounds(10, 460, 360, 280);

        home.setToolTipText("HOME");
        home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                homeMousePressed(evt);
            }
        });
        add(home);
        home.setBounds(930, 57, 80, 60);

        hawklogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/hawk_logo.png"))); // NOI18N
        add(hawklogo);
        hawklogo.setBounds(0, 0, 350, 100);

        ROPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ROPanel.setMaximumSize(new java.awt.Dimension(280, 280));
        ROPanel.setMinimumSize(new java.awt.Dimension(280, 280));
        ROPanel.setOpaque(false);
        ROPanel.setLayout(null);

        jButton1.setText("All RO  Emedia   Commision");
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        ROPanel.add(jButton1);
        jButton1.setBounds(60, 40, 190, 23);

        jButton3.setText("Emedia RO by month ");
        jButton3.setOpaque(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        ROPanel.add(jButton3);
        jButton3.setBounds(260, 40, 180, 23);

        jButton5.setText("All Newspaper  RO Commision");
        jButton5.setOpaque(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        ROPanel.add(jButton5);
        jButton5.setBounds(60, 150, 190, 23);

        jButton6.setText("Newspaper RO by month");
        jButton6.setOpaque(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        ROPanel.add(jButton6);
        jButton6.setBounds(260, 150, 170, 23);

        jButton7.setText("Bills From Newspaper ");
        jButton7.setOpaque(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        ROPanel.add(jButton7);
        jButton7.setBounds(260, 200, 170, 23);

        jButton11.setText("Bills From Emedia");
        jButton11.setOpaque(false);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        ROPanel.add(jButton11);
        jButton11.setBounds(260, 80, 180, 23);

        jButton14.setText("Emedia RO by Station ");
        jButton14.setOpaque(false);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        ROPanel.add(jButton14);
        jButton14.setBounds(60, 80, 190, 23);

        jButton15.setText("Newspaper RO by Station");
        jButton15.setOpaque(false);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        ROPanel.add(jButton15);
        jButton15.setBounds(60, 200, 190, 23);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Newspaper");
        ROPanel.add(jLabel1);
        jLabel1.setBounds(140, 120, 230, 15);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Electronic Media");
        ROPanel.add(jLabel5);
        jLabel5.setBounds(140, 10, 230, 15);

        add(ROPanel);
        ROPanel.setBounds(380, 160, 600, 280);

        home1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/button_home.png"))); // NOI18N
        home1.setText("jLabel10");
        home1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        home1.setMaximumSize(new java.awt.Dimension(80, 80));
        home1.setMinimumSize(new java.awt.Dimension(80, 80));
        home1.setPreferredSize(new java.awt.Dimension(80, 80));
        home1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                home1MouseClicked(evt);
            }
        });
        add(home1);
        home1.setBounds(940, 20, 80, 80);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/homepage_background.png"))); // NOI18N
        add(background);
        background.setBounds(0, 0, 1024, 768);
    }// </editor-fold>//GEN-END:initComponents

    private void NewsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewsActionPerformed
        if(!Codetxt.getText().isEmpty())
            {
             Colum="newspaper";
             media = "n_ro";
             MediaPop.setVisible(true);
             
             join = queryEnd[0];deductJoin= deductionQuery[0]; 
             mediaName="Newspaper";
            reportName= "Customer-Wise Release Order Report.";
            }
        else{
               JOptionPane.showMessageDialog(null, "Select a customer first!! ", "Error", JOptionPane.ERROR_MESSAGE);
            }     
    }//GEN-LAST:event_NewsActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        
        new search(Home,"select id,name from cust where 1",this,"cust",true);

    }//GEN-LAST:event_SearchActionPerformed

    private void PCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PCodeActionPerformed

    private void NsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NsearchActionPerformed
     
        new search(Home,"select id,name from "+Colum +" where 1",this,Colum,false);

    }//GEN-LAST:event_NsearchActionPerformed

    private void PCode3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PCode3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PCode3ActionPerformed

    private void Nsearch3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nsearch3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Nsearch3ActionPerformed

    private void MonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MonthActionPerformed
        if(!Codetxt.getText().isEmpty())
            {
            searchIn="CCode"; 
            media="n_ro";
            code= Codetxt.getText();
            MonthPop.setVisible(true);
            
            
            join = queryEnd[0];deductJoin= deductionQuery[0]; 
            mediaName="Newspaper";
            reportName= "Customer-Wise Release Order Report for Newspaper";
        
            }
        else{
               JOptionPane.showMessageDialog(null, "Select a customer first!! ", "Error", JOptionPane.ERROR_MESSAGE);
            }  
    }//GEN-LAST:event_MonthActionPerformed

    private void MediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MediaActionPerformed
        if(!Codetxt.getText().isEmpty())
            {
            Colum="emedia";
            media = "e_ro";
            MediaPop.setVisible(true);
            
            join = queryEnd[1];deductJoin= deductionQuery[1]; 
            mediaName="Electronic Media";
            reportName= "Customer-Wise Release Order Report.";
            }
        else{
               JOptionPane.showMessageDialog(null, "Select a customer first!! ", "Error", JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_MediaActionPerformed

    private void AllNSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllNSActionPerformed
        
        if(!Codetxt.getText().isEmpty()){ 
            this.setEnabled(false);
            
            join = queryEnd[0];deductJoin= deductionQuery[0]; 
            mediaName="Newspaper";
            reportName= "Customer-Wise Release Order Report.";
        
            String query;
        query = queryStart+" from n_ro r "+ join+" where r.ccode = '"+Codetxt.getText()+"'";
        
        new ReportWindow(query,reportName,"All "+mediaName+" release orders For Customer "+Nametxt.getText(),deductionQuery[0]+" where r.ccode = '"+Codetxt.getText()+"')",Home);
        
        }
        else{
               JOptionPane.showMessageDialog(null, "Select a customer first!! ", "Error", JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_AllNSActionPerformed

    private void mediaSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mediaSearchActionPerformed
      
        
        
        String query;
        query = queryStart+" from "+ media + " r "+join+" where r.CCode = '" + Codetxt.getText()
                + "' And r.MCode = '" + PCode.getText() + "'";
        new ReportWindow(query,reportName,"For Customer: "+Nametxt.getText()+" by "+mediaName+": "+PName.getText(),deductJoin+" where r.CCode = '" + Codetxt.getText()
                + "' And r.MCode = '" + PCode.getText() + "')", Home);
    }//GEN-LAST:event_mediaSearchActionPerformed

    private void NMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NMonthActionPerformed
         if(!NCode.getText().isEmpty()) 
            {
            searchIn = "MCode";
            code= NCode.getText();
            MonthPop.setVisible(true);
            reportName= "Month-Wise Release Orders of \""+NName.getText().toUpperCase()+"\"";
            }
        else{
             JOptionPane.showMessageDialog(null, "Select a Newspaper first!! ", "Error", JOptionPane.ERROR_MESSAGE);
            }
         
    }//GEN-LAST:event_NMonthActionPerformed

    private void AllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllActionPerformed
        if(!NCode.getText().isEmpty()){ 
            this.setEnabled(false);
            
            String query;
            query = queryStart+" from "
                +media+" r "+join+" where r.MCode = '"+NCode.getText()+"'";
        new ReportWindow(query,"All Release Orders of \""+NName.getText().toUpperCase()+"\"","",deductJoin+" where r.MCode = '"+NCode.getText()+"')",Home);
            
        }
        else{
               JOptionPane.showMessageDialog(null, "Select a Newspaper first!! ", "Error", JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_AllActionPerformed

    private void Generate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Generate1ActionPerformed
        if(!NCode.getText().isEmpty()){ 
            this.setEnabled(false);
            
            
        String query;
        query = queryStart+" from "
                +media+" r "+join+" where r.MCode = '"+NCode.getText()+"' and r.nbill != '-1'";
        new ReportWindow(query,"Received Bill Release Orders of \""+NName.getText().toUpperCase()+"\"","All release orders of \""+NName.getText().toUpperCase()+"\" for which the bill is received.",deductJoin+" where r.MCode = '"+NCode.getText()+"' and r.nbill != '-1')",Home);
            
        }
        else{
               JOptionPane.showMessageDialog(null, "Select a Newspaper first!! ", "Error", JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_Generate1ActionPerformed

    private void UnGenerated1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnGenerated1ActionPerformed
       
        if(!NCode.getText().isEmpty()){ 
            this.setEnabled(false);
            
            String query;
        query = queryStart+" from "
                +media+" r "+join+" where MCode = '"+NCode.getText()+"' and nbill = '-1'";
       
        
        new ReportWindow(query,"Not Received Bill Release Orders of \""
        +NName.getText().toUpperCase()+"\"","All release orders of \""
        +NName.getText().toUpperCase()+"\" for which the bill is not received.",
        deductJoin+" where MCode = '"+NCode.getText()+"' and nbill = '-1')",Home);
            
            }
        else{
               JOptionPane.showMessageDialog(null, "Select a Newspaper first!! ", "Error", JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_UnGenerated1ActionPerformed

    private void NCodeSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NCodeSearchActionPerformed
       if(newsR.isSelected()){
           join = queryEnd[0];deductJoin= deductionQuery[0]; 
       }else{
           join = queryEnd[1];deductJoin= deductionQuery[1]; 
       }
        
        new search(Home,"select id,name from "+mediaType+" where 1",this,isNReport);
    }//GEN-LAST:event_NCodeSearchActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        String date = year.getSelectedItem()+"-"+ month;
        
        
        String query;
        String where = " where r."+searchIn+" = '"+code
                +"' And r.date  REGEXP '"+date+"-[0-9][0-9]?'";
       
        
        query = queryStart+" from "
                +media+" r "+join+where;
       
        new ReportWindow(query,reportName,"For Month of "+
        monthBox.getSelectedItem()+","+year.getSelectedItem(),deductJoin+where+")",Home);
        monthBox.setVisible(false);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void monthBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_monthBoxItemStateChanged
        if(monthBox.getSelectedIndex()<9)
            month = "0"+ (monthBox.getSelectedIndex()+1);
        else
            month = String.valueOf(monthBox.getSelectedIndex()+1);
    }//GEN-LAST:event_monthBoxItemStateChanged

    private void AllEmediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllEmediaActionPerformed
        if(!Codetxt.getText().isEmpty()){ 
            this.setEnabled(false);
       
            join = queryEnd[1];deductJoin= deductionQuery[1]; 
        mediaName="Electronic Media";
        reportName= "Customer-Wise Release Order Report.";
        
        String query;
        String where =" where r.CCode = '"+Codetxt.getText()+"'";
        
        query = queryStart + " from e_ro r "+join+where;
        new ReportWindow(query,reportName,"All "
        +mediaName+" release orders For Customer "+Nametxt.getText(),deductJoin+where+")",Home);
        
        }
        else{
               JOptionPane.showMessageDialog(null, "Select a customer first!! ", "Error", JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_AllEmediaActionPerformed

    private void mediaRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mediaRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mediaRActionPerformed

    private void newsRItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_newsRItemStateChanged
       if(newsR.isSelected())
       {
       isNReport=true;
       media= "n_ro";
       mediaType="newspaper";
       join = queryEnd[0];deductJoin= deductionQuery[0]; 
       }
           
    }//GEN-LAST:event_newsRItemStateChanged

    private void mediaRItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_mediaRItemStateChanged
        if(mediaR.isSelected())
        {
            isNReport = false;
            media = "e_ro";
            mediaType = "emedia";
            join = queryEnd[1];deductJoin= deductionQuery[1]; 
        }
    }//GEN-LAST:event_mediaRItemStateChanged

    private void Month1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Month1ActionPerformed
        if(!Codetxt.getText().isEmpty())
            {
            searchIn="CCode"; 
            media="e_ro";
            code= Codetxt.getText();
            MonthPop.setVisible(true);
            
            join = queryEnd[1];deductJoin= deductionQuery[1]; 
            mediaName = "Electronic Media";
            reportName = "Monthly Customer-Wise Release Order Report for Electronic Media.";
            }
        else{
               JOptionPane.showMessageDialog(null, "Select a customer first!! ", "Error", JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_Month1ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        MediaPop.setVisible(false);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        MonthPop.setVisible(false);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void homeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMousePressed
        Home.jPanel1.setVisible(false);
        Home.Remove();
        Home.ShowWindow(new HomePage(Home));

    }//GEN-LAST:event_homeMousePressed

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked

        Home.jPanel1.setVisible(false);
        Home.Remove();
        Home.ShowWindow(new HomePage(Home));

    }//GEN-LAST:event_homeMouseClicked

    private void PCode4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PCode4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PCode4ActionPerformed

    private void Nsearch4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nsearch4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Nsearch4ActionPerformed

    private void monthBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_monthBox1ItemStateChanged
      
        if(monthBox1.getSelectedIndex()<9){
            month = "0"+ (monthBox1.getSelectedIndex()+1);
           
        }
        else
            month = String.valueOf(monthBox1.getSelectedIndex()+1);
    }//GEN-LAST:event_monthBox1ItemStateChanged

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         this.setEnabled(false);
         String date = year1.getSelectedItem()+"-"+ month;
         String where = " r where r.`R.O Date` REGEXP '"+date+"-[0-9][0-9]?'";
         String query = "select * from "+media2+where;
     
         new ReportWindow(query,reportName,
        "For Month of "+monthBox1.getSelectedItem()+","+year1.getSelectedItem()
        ,deductJoin+" where r.`R.O Date` REGEXP '"+date+"-[0-9][0-9]?')",Home);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        MonthPop1.setVisible(false);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void home1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home1MouseClicked
        
        Home.ShowWindow(new HomePage(Home));
    }//GEN-LAST:event_home1MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        media = "e_ro";
        MonthPop1.setVisible(true);
        media2 = "allreportsview";
        reportName = "Newspaper Release Orders Month-Wise";
        deductJoin= deductionQuery[2];
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        deductJoin= deductionQuery[2];
        String query = "select * from allreportsview";
        new ReportWindow(query,"All Release Orders of Newspaper","",deductJoin+")",Home);

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        media = "e_ro";
        MonthPop1.setVisible(true);
        media2 = "allemediareportsview";
        reportName = "Electronic Media Release Orders Month-Wise";
        deductJoin= deductionQuery[3];
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        
        deductJoin= deductionQuery[3];
        String query = "select * from allemediareportsview";
        new ReportWindow(query,"All Release Orders of Electronic Media","",deductJoin+")",Home);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
                
                String query = "select * from recievedbill";
                new ReportWindow(query,"All Newspaper Recieved Bills","",deductionQuery[4]+")",Home);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
                
                String query = "select * from emediabills";
                new ReportWindow(query,"All Electronic Media Recieved Bills","",deductionQuery[5]+")",Home);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void All1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_All1ActionPerformed
            if(!NCode.getText().isEmpty()){ 
            this.setEnabled(false);
            
            CityPop.setVisible(true);
            }
        else{
               JOptionPane.showMessageDialog(null, "Select a Newspaper first!! ", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
    }//GEN-LAST:event_All1ActionPerformed

    private void citySearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_citySearchActionPerformed
          if(!NCode.getText().isEmpty()){ 
            this.setEnabled(false);
            
            String query;
            query = queryStart+" from "
                +media+" r "+join+" where r.MCode = '"+NCode.getText()+"' and r.mstation = '"+cityName.getText()+"'";
        new ReportWindow(query,"All Release Orders of \""+NName.getText().toUpperCase()+"\"","",deductJoin+" where r.MCode = '"+NCode.getText()+"' and r.mstation = '"+cityName.getText()+"')",Home);
        CityPop.setVisible(false);  
        }
        else{
               JOptionPane.showMessageDialog(null, "Select a Newspaper/Electronic Media first!! ", "Error", JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_citySearchActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        CityPop.setVisible(true);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void citySearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_citySearch1ActionPerformed
        this.setEnabled(false);
         String where = " r where r.`Station` = '"+cityName1.getText()+"' ";
         String query = "select * from "+media2+where;
     
         new ReportWindow(query,reportName,
        "For Month of "+monthBox1.getSelectedItem()+","+year1.getSelectedItem()
        ,deductJoin+" where `Station` = '"+cityName1.getText()+"' )",Home);
    }//GEN-LAST:event_citySearch1ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        allmediaCityPop1.setVisible(false);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        media = "e_ro";
        allmediaCityPop1.setVisible(true);
        media2 = "allemediareportsview";
        reportName = "Electronic Media Release Orders Station-Wise";
        deductJoin= deductionQuery[3];
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
       media = "n_ro";
        allmediaCityPop1.setVisible(true);
        media2 = "allreportsview";
        reportName = "Newspaper Release Orders Station-Wise";
        deductJoin= deductionQuery[2];
    }//GEN-LAST:event_jButton15ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton All;
    private javax.swing.JButton All1;
    private javax.swing.JButton AllEmedia;
    private javax.swing.JButton AllNS;
    private javax.swing.JPanel CityPop;
    private javax.swing.JTextField Codetxt;
    private javax.swing.JPanel CustomerPanel;
    private javax.swing.JButton Generate1;
    private javax.swing.JButton Media;
    private javax.swing.JPanel MediaPop;
    private javax.swing.JPanel MediaPop3;
    private javax.swing.JPanel MediaPop4;
    private javax.swing.JButton Month;
    private javax.swing.JButton Month1;
    private javax.swing.JPanel MonthPop;
    private javax.swing.JPanel MonthPop1;
    private javax.swing.JTextField NCode;
    private javax.swing.JButton NCodeSearch;
    private javax.swing.JButton NMonth;
    private javax.swing.JTextField NName;
    private javax.swing.JTextField Nametxt;
    private javax.swing.JButton News;
    private javax.swing.JPanel NewsEmediapanel;
    private javax.swing.JButton Nsearch;
    private javax.swing.JButton Nsearch3;
    private javax.swing.JButton Nsearch4;
    private javax.swing.JTextField PCode;
    private javax.swing.JTextField PCode3;
    private javax.swing.JTextField PCode4;
    private javax.swing.JTextField PName;
    private javax.swing.JTextField PName3;
    private javax.swing.JTextField PName4;
    private javax.swing.JPanel ROPanel;
    private javax.swing.JButton Search;
    private javax.swing.JButton UnGenerated1;
    private javax.swing.JPanel allmediaCityPop1;
    private javax.swing.JLabel background;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField cityName;
    private javax.swing.JTextField cityName1;
    private javax.swing.JButton citySearch;
    private javax.swing.JButton citySearch1;
    private javax.swing.JLabel hawklogo;
    private javax.swing.JLabel home;
    private javax.swing.JLabel home1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton mediaR;
    private javax.swing.JButton mediaSearch;
    private javax.swing.JComboBox monthBox;
    private javax.swing.JComboBox monthBox1;
    private javax.swing.JRadioButton newsR;
    private javax.swing.JComboBox year;
    private javax.swing.JComboBox year1;
    // End of variables declaration//GEN-END:variables

    void SetValues(String id, String names,boolean IsCus) {
       
      if(IsCus)
      {   
       Nametxt.setText(names);
       Codetxt.setText(id);
      }
      else
      {
      PName.setText(names);
      PCode.setText(id);
      }    
    }

    void SetValuesReport(String id, String name, boolean nReport) {
    
        NName.setText(name);
        NCode.setText(id);
    }

    
}
