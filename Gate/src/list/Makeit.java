package list;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Makeit {

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				info ner = new info();
				
			}
		});
		
	}

}
class info extends JFrame
{
	static int struc_gen,struc_obc,struc_sc,struc_st,
	hy_gen,hy_obc,hy_sc,hy_st,
	geo_gen,geo_sc,geo_obc,geo_st,
	env_gen,env_obc,env_sc,env_st,
	tra_gen,tra_obc,tra_sc,tra_st,x,y,ok,total_var_seats,extra_gen,extra_obc,extra_sc,extra_st;
    
	static JLabel stru_g,stru_obc,stru_sc,stru_st,
	h_g,h_obc,h_sc,h_st,
	ge_g,ge_obc,ge_sc,ge_st,
	en_g,en_obc,en_sc,en_st,
	tr_g,tr_obc,tr_sc,tr_st,ex_g,ex_obc,ex_sc,ex_st;
    final static int total_seats=47;     

	
	public info()
	{
		JMenuBar mb = new JMenuBar();
		ok=0;total_var_seats=0;
		this.setFocusable(true);
		JButton about = new JButton("About");
		about.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				final JFrame fr=new JFrame();
				fr.setSize(280,160);
				fr.setLayout(new FlowLayout());
				Toolkit toolkit1= Toolkit.getDefaultToolkit();
				Dimension dimension = toolkit1.getScreenSize();
				int height1=(int) dimension.getHeight();
				int width1=(int) dimension.getWidth();
                 
				fr.setLocation(width1/2, height1/2);
				fr.add(new JLabel("DEVELOPED BY :                                "));
				fr.add(new JLabel("Mehul Jain"));
				fr.add(new JLabel("Computer Science And Engineering"));
				fr.add(new JLabel("IIT(BHU), Varanasi"));
				fr.add(new JLabel("Contact: mehul.jain.cse12@iitbhu.ac.in"));
				JButton kj=new JButton("Ok");
				
				fr.add(kj);
				kj.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
					fr.dispose();	
					}
				});
				fr.setVisible(true);
				fr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

			}
		});
		mb.add(about);
		setJMenuBar(mb);
		
		
		final File file = new File("filename.txt");
		try {
			file.createNewFile();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		FileWriter fw = null;
		try {
			fw = new FileWriter(file.getAbsoluteFile());
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		final BufferedWriter bw = new BufferedWriter(fw);
		try {
			bw.write("SR no." + "\t\t"+"Name"+"\t\t"+"Category"+"\t\t"+"Gate Score"+"\t\t"+"Category Selected"+"\t\t"+"Branch Alloted"+"\n");
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		imp=-1; 
		
		extra_gen=3;
		extra_obc=2;
		extra_sc=2;
		extra_st=2;
		
		struc_gen=5;
		struc_obc=2;
		struc_sc=1;
		struc_st=0;
		
		hy_gen=5;
		hy_obc=2;
		hy_sc=1;
		hy_st=0;
		
		geo_gen=5;
		geo_obc=2;
		geo_sc=1;
		geo_st=0;
		
		env_gen=5;
		env_obc=2;
		env_sc=1;
		env_st=1;
		
		tra_gen=2;
		tra_obc=2;
		tra_sc=1;
		tra_st=0;

		setTitle("Informations");
		Toolkit toolkit= Toolkit.getDefaultToolkit();
		Dimension dimension = toolkit.getScreenSize();
		int height=(int) dimension.getHeight();
		int width=(int) dimension.getWidth();
        
		setSize(width, height);
		setVisible(true);
		setResizable(true);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        WindowListener liste = new WindowAdapter() {

            public void windowClosing(WindowEvent w) {
            	
            	
            	
                int confirmed = JOptionPane.showConfirmDialog(null,
                        "Are you sure you want to quit?", "Confirm Quit",
                        JOptionPane.YES_NO_OPTION);
               
                //Close if user confirmed
                if (confirmed == JOptionPane.YES_OPTION)
                {                            
                        //Close frame
                        dispose();
                }           
                   }
        };

        addWindowListener(liste);
		
		
		final JPanel pane=new JPanel();
		JScrollPane scr=new JScrollPane(pane);
		scr.setLayout(new ScrollPaneLayout());

		add(scr);
		GridBagLayout layout=new GridBagLayout();
		pane.setLayout(layout);
		
		final GridBagConstraints c=new GridBagConstraints();
		c.gridx=-1;
		c.gridy=-1;
		c.weightx=1;
		c.weighty=1;
       // c.ipadx=5;
        //c.ipady=5;
        c.gridx++;
        c.gridy++;
        c.insets=new Insets(10,10,3,10);
        JLabel spec = new JLabel("Specialized");
        pane.add(spec,c);
        c.gridx++;
        JLabel hg=new JLabel("GEN");
        pane.add(hg,c);
        
        c.gridx++;
        JLabel hobc=new JLabel("OBC");
        pane.add(hobc,c);
        
        c.gridx++;
        JLabel hsc=new JLabel("SC");
        pane.add(hsc,c);

        c.gridx++;
        JLabel hst=new JLabel("ST");
        pane.add(hst,c);
        
        
        c.gridx=-1;
        
        c.gridy++;
        c.gridx++;
        pane.add(new JLabel("Structural"),c);
        
        c.gridx++;
        stru_g=new JLabel(struc_gen + "");
        pane.add(stru_g,c);
        
        
        c.gridx++;
        stru_obc=new JLabel(struc_obc + "");
        pane.add(stru_obc,c);
        
        c.gridx++;
        stru_sc=new JLabel(struc_sc + "");
        pane.add(stru_sc,c);
        
        
        c.gridx++;
        stru_st=new JLabel(struc_st + "");
        pane.add(stru_st,c);
        
        
        c.gridx=-1;
        c.gridy++;
        
        
        c.gridx++;
        pane.add(new JLabel("Hydraulics "),c);

        c.gridx++;
        h_g=new JLabel(hy_gen + "");
        pane.add(h_g,c);
        
        c.gridx++;
        h_obc=new JLabel(hy_obc + "");
        pane.add(h_obc,c);

        c.gridx++;
        h_sc=new JLabel(hy_sc + "");
        pane.add(h_sc,c);

        c.gridx++;
        h_st=new JLabel(hy_st + "");
        pane.add(h_st,c);

        c.gridx=-1;
        c.gridy++;

        c.gridx++;
        pane.add(new JLabel("Geotechnical "),c);

        c.gridx++;
        ge_g=new JLabel(geo_gen + "");
        pane.add(ge_g,c);
        
        c.gridx++;
        ge_obc=new JLabel(geo_obc + "");
        pane.add(ge_obc,c);

        c.gridx++;
        ge_sc=new JLabel(geo_sc + "");
        pane.add(ge_sc,c);


        c.gridx++;
        ge_st=new JLabel(geo_st + "");
        pane.add(ge_st,c);



        c.gridx=-1;
        c.gridy++;

        c.gridx++;
        pane.add(new JLabel("Environmental "),c);

        c.gridx++;
        en_g=new JLabel(env_gen + "");
        pane.add(en_g,c);
        
        c.gridx++;
        en_obc=new JLabel(env_obc + "");
        pane.add(en_obc,c);

        c.gridx++;
        en_sc=new JLabel(env_sc + "");
        pane.add(en_sc,c);


        c.gridx++;
        en_st=new JLabel(env_st + "");
        pane.add(en_st,c);

        
        c.gridx=-1;
        c.gridy++;

        c.gridx++;
        pane.add(new JLabel("Transportation "),c);

        c.gridx++;
        tr_g=new JLabel(tra_gen + "");
        pane.add(tr_g,c);
        
        c.gridx++;
        tr_obc=new JLabel(tra_obc + "");
        pane.add(tr_obc,c);

        c.gridx++;
        tr_sc=new JLabel(tra_sc + "");
        pane.add(tr_sc,c);


        c.gridx++;
        tr_st=new JLabel(tra_st + "");
        pane.add(tr_st,c);

        // "Geotechnical","Environmental","Transportation" 
        c.gridy++;
        c.gridx=0;
        pane.add(new JLabel("Remaining Seats"),c);
        
        c.gridx++;
        ex_g=new JLabel(extra_gen+"");
        pane.add(ex_g,c);
        
        c.gridx++;
        ex_obc=new JLabel(extra_obc+"");
        pane.add(ex_obc,c);
        
        c.gridx++;
        ex_sc=new JLabel(extra_sc+"");
        pane.add(ex_sc,c);
        
        c.gridx++;
        ex_st=new JLabel(extra_obc+"");
        pane.add(ex_st,c);
        
        c.gridy++;
        c.gridx=0;
        pane.add(new JLabel("Enter Students"),c);
        
        final JTextField field=new JTextField(5);
		c.gridx++;
	    pane.add(field,c);
	    
	    JButton button = new JButton("ok");
		c.gridx++;
		
        pane.add(button,c);
        c.gridy++;        

	    final JButton finb =new JButton("counsel");
	     
        button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
			if(field.getText().isEmpty())
			{
				final JFrame fr=new JFrame();
				fr.setSize(220,100);
				fr.setLayout(new FlowLayout());
				Toolkit toolkit1= Toolkit.getDefaultToolkit();
				Dimension dimension = toolkit1.getScreenSize();
				int height1=(int) dimension.getHeight();
				int width1=(int) dimension.getWidth();
                 
				fr.setLocation(width1/2, height1/2);
				fr.add(new JLabel("Enter number of students"));
				JButton kj=new JButton("Ok");
				
				fr.add(kj);
				kj.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
					fr.dispose();	
					}
				});
				fr.setVisible(true);
				fr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			    
			}
			else
			{   
				if(ok==-1)
				{
					final JFrame fr=new JFrame();
					fr.setSize(400,80);
					fr.setLayout(new FlowLayout());
					Toolkit toolkit1= Toolkit.getDefaultToolkit();
					Dimension dimension = toolkit1.getScreenSize();
					int height1=(int) dimension.getHeight();
					int width1=(int) dimension.getWidth();
	                 
					fr.setLocation(width1/2, height1/2);
					fr.add(new JLabel("It has been already pressed. try moving the window."));
					JButton kj=new JButton("Ok");
					
					fr.add(kj);
					kj.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent arg0) {
							// TODO Auto-generated method stub
						fr.dispose();	
						}
					});
					fr.setVisible(true);
					fr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				    
				}
				
				else
				{
			
				ok=-1;
				n= (Integer.parseInt(field.getText()));
				total_var_seats=n;
		        c.gridx=-1;
				JLabel label = new JLabel("SR No.");
				c.weightx=1;
				c.weighty=1;
				c.gridx++;
				c.gridy++;
				
			    pane.add(label,c);
			    
				JLabel label1 = new JLabel("Name");
				c.weightx=3;
				c.weighty=1;
				c.gridx++;
			    pane.add(label1,c);
			    
			    JLabel label2= new JLabel("Category");
			    c.weightx=1;
			    c.weighty=1;
			    c.gridx++;
			    pane.add(label2,c);
			    
			    JLabel label3= new JLabel("Gate Score");
			    c.weightx=1;
			    c.weighty=1;
			    c.gridx++;
			    pane.add(label3,c);
			    
			    JLabel label4= new JLabel("Preference 1");
			    c.weightx=1;
			    c.weighty=1;
			    c.gridx++;
			    pane.add(label4,c);
			    
			    JLabel label5= new JLabel("Preference 2");
			    c.weightx=1;
			    c.weighty=1;
			    c.gridx++;
			    pane.add(label5,c);
			    
			    JLabel label6= new JLabel("Preference 3");
			    c.weightx=1;
			    c.weighty=1;
			    c.gridx++;
			    pane.add(label6,c);
			    
			    JLabel label7= new JLabel("Preference 4");
			    c.weightx=1;
			    c.weighty=1;
			    c.gridx++;
			    pane.add(label7,c);
			    
			    JLabel label8= new JLabel("Preference 5");
			    c.weightx=1;
			    c.weighty=1;
			    c.gridx++;
			    pane.add(label8,c);
			    
			    JLabel label9= new JLabel("Confirm");
			    c.weightx=1;
			    c.weighty=1;
			    c.gridx++;
			    pane.add(label9,c);
			    
			    JLabel labelx = new JLabel("Reset");
			    c.gridx++;
			    pane.add(labelx,c);
			    
			    JLabel label10 = new JLabel("General Preference");
			    c.gridx++;
			    pane.add(label10,c);
			    
			    JLabel label11 = new JLabel("Category Preference");
			    c.gridx++;
			    pane.add(label11,c);
			    
			    JLabel label12 = new JLabel("Select Prefrence");
			    c.gridx++;
			    pane.add(label12,c);
			    
			    JLabel label13 = new JLabel("Take Seat");
			    c.gridx++;
			    pane.add(label13,c);
			    
			    JLabel label14 = new JLabel("Lock");
			    c.gridx++;
			    pane.add(label14,c);
			    
			    
			    
			    lockl = new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(st[imp].lp==-1)
						{
							final JFrame fr=new JFrame();
							fr.setSize(230,100);
							fr.setLayout(new FlowLayout());
							Toolkit toolkit1= Toolkit.getDefaultToolkit();
							Dimension dimension = toolkit1.getScreenSize();
							int height1=(int) dimension.getHeight();
							int width1=(int) dimension.getWidth();
			                 //System.out.println("coming for "+ imp);
							fr.setLocation(width1/2, height1/2);
							fr.add(new JLabel("Don't press the lock twice"));
							JButton kj=new JButton("Ok");
							
							fr.add(kj);
							kj.addActionListener(new ActionListener() {
								
								@Override
								public void actionPerformed(ActionEvent arg0) {
									// TODO Auto-generated method stub
								fr.dispose();	
								}
							});
							//fr.setVisible(true);
							fr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						    
						}
						else
						{
						if(st[imp].pref[0].getSelectedIndex()==0 && st[imp].prefsel.getSelectedIndex()==1)
						{
							final JFrame fr=new JFrame();
							fr.setSize(400,80);
							fr.setLayout(new FlowLayout());
							Toolkit toolkit1= Toolkit.getDefaultToolkit();
							Dimension dimension = toolkit1.getScreenSize();
							int height1=(int) dimension.getHeight();
							int width1=(int) dimension.getWidth();
			                 
							fr.setLocation(width1/2, height1/2);
							fr.add(new JLabel("General Student cannot select category as preference"));
							JButton kj=new JButton("Ok");
							
							fr.add(kj);
							kj.addActionListener(new ActionListener() {
								
								@Override
								public void actionPerformed(ActionEvent arg0) {
									// TODO Auto-generated method stub
								fr.dispose();	
								}
							});
							fr.setVisible(true);
							fr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						    
						}
						else
						{
							if(st[imp].takeseat.getSelectedIndex()==0)
						{       
							if(st[imp].prefsel.getSelectedIndex()==0)
							{
								if(st[imp].gi==0)
								{
									struc_gen-=1;
									stru_g.setText(struc_gen+"");
									student.tot_set++;
}
								else if(st[imp].gi==1)
								{
									hy_gen-=1;
									h_g.setText(hy_gen+"");
									student.tot_set++;
}
								else if(st[imp].gi==2)
								{
									geo_gen-=1;
									ge_g.setText(geo_gen+"");
									student.tot_set++;
}
								else if(st[imp].gi==3)
								{
									env_gen-=1;
									en_g.setText(env_gen+"");
									student.tot_set++;
}
								else if(st[imp].gi==4)
								{
									tra_gen-=1;
									tr_g.setText(tra_gen+"");
									student.tot_set++;
}
								else if(st[imp].gi==5)
								{
									struc_gen-=1;
									extra_gen-=1;
									ex_g.setText(extra_gen+"");
									student.tot_set++;
								}
								else if(st[imp].gi==6)
								{
									hy_gen-=1;
									extra_gen-=1;
									ex_g.setText(extra_gen+"");
									student.tot_set++;
								}
								
								else if(st[imp].gi==7)
								{
									geo_gen-=1;
									extra_gen-=1;
									ex_g.setText(extra_gen+"");
									student.tot_set++;
								}
								else if(st[imp].gi==8)
								{
									env_gen-=1;
									extra_gen-=1;
									ex_g.setText(extra_gen+"");
									student.tot_set++;
								}
								else if(st[imp].gi==9)
								{
									tra_gen-=1;
									extra_gen-=1;
									ex_g.setText(extra_gen+"");
									student.tot_set++;
								}
								
								
								
								
								
							}
							
							else
							{
								if(st[imp].pref[0].getSelectedIndex()==1)
								{
									if(st[imp].ci==0)
									{
										struc_obc-=1;
										stru_obc.setText(struc_obc+"");
										student.tot_set++;
}
									else if(st[imp].ci==1)
									{
										hy_obc-=1;
										h_obc.setText(hy_obc+"");
										student.tot_set++;
}
									else if(st[imp].ci==2)
									{
										geo_obc-=1;
										ge_obc.setText(geo_obc+"");
										student.tot_set++;
}
									else if(st[imp].ci==3)
									{
										env_obc-=1;
										en_obc.setText(env_obc+"");
										student.tot_set++;
}
									else if(st[imp].ci==4)
									{
										tra_obc-=1;
										tr_obc.setText(tra_obc+"");
										student.tot_set++;
}
									else if(st[imp].ci==5)
									{
										struc_obc-=1;
										extra_obc-=1;
										ex_obc.setText(extra_obc+"");
										student.tot_set++;
									}
									else if(st[imp].ci==6)
									{
										hy_obc-=1;
										extra_obc-=1;
										ex_obc.setText(extra_obc+"");
										student.tot_set++;
									}
									
									else if(st[imp].ci==7)
									{
										geo_obc-=1;
										extra_obc-=1;
										ex_obc.setText(extra_obc+"");
										student.tot_set++;
									}
									else if(st[imp].ci==8)
									{
										env_obc-=1;
										extra_obc-=1;
										ex_obc.setText(extra_obc+"");
										student.tot_set++;
									}
									else if(st[imp].ci==9)
									{
										tra_obc-=1;
										extra_obc-=1;
										ex_obc.setText(extra_obc+"");
										student.tot_set++;
									}
								}
								
								else if(st[imp].pref[0].getSelectedIndex()==2)
								{
									if(st[imp].ci==0)
									{
										struc_sc-=1;
										stru_sc.setText(struc_sc+"");
										student.tot_set++;
}
									else if(st[imp].ci==1)
									{
										hy_sc-=1;
										h_sc.setText(hy_sc+"");
										student.tot_set++;
}
									else if(st[imp].ci==2)
									{
										geo_sc-=1;
										ge_sc.setText(geo_sc+"");
										student.tot_set++;
}
									else if(st[imp].ci==3)
									{
										env_sc-=1;
										en_sc.setText(env_sc+"");
										student.tot_set++;
}
									else if(st[imp].ci==4)
									{
										tra_sc-=1;
										tr_sc.setText(tra_sc+"");
										student.tot_set++;
}
									else if(st[imp].ci==5)
									{
										struc_sc-=1;
										extra_sc-=1;
										ex_sc.setText(extra_sc+"");
										student.tot_set++;
									}
									else if(st[imp].ci==6)
									{
										hy_sc-=1;
										extra_sc-=1;
										ex_sc.setText(extra_sc+"");
										student.tot_set++;
									}
									
									else if(st[imp].ci==7)
									{
										geo_sc-=1;
										extra_sc-=1;
										ex_sc.setText(extra_sc+"");
										student.tot_set++;
									}
									else if(st[imp].ci==8)
									{
										env_sc-=1;
										extra_sc-=1;
										ex_sc.setText(extra_sc+"");
										student.tot_set++;
									}
									else if(st[imp].ci==9)
									{
										tra_sc-=1;
										extra_sc-=1;
										ex_sc.setText(extra_sc+"");
										student.tot_set++;
									}
								}
								
								else if(st[imp].pref[0].getSelectedIndex()==3)
								{
									if(st[imp].ci==0)
									{
										struc_st-=1;
										stru_st.setText(struc_st+"");
										student.tot_set++;
}
									else if(st[imp].ci==1)
									{
										hy_st-=1;
										h_st.setText(hy_st+"");
										student.tot_set++;
}
									else if(st[imp].ci==2)
									{
										geo_st-=1;
										ge_st.setText(geo_st+"");
										student.tot_set++;
}
									else if(st[imp].ci==3)
									{
										env_st-=1;
										en_st.setText(env_st+"");
										student.tot_set++;
                                    }
									else if(st[imp].ci==4)
									{
										tra_st-=1;
										tr_st.setText(tra_st+"");
										student.tot_set++;
									}
									else if(st[imp].ci==5)
									{
										struc_st-=1;
										extra_st-=1;
										ex_st.setText(extra_st+"");
										student.tot_set++;
									}
									else if(st[imp].ci==6)
									{
										hy_st-=1;
										extra_st-=1;
										ex_st.setText(extra_st+"");
										student.tot_set++;
									}
									
									else if(st[imp].ci==7)
									{
										geo_st-=1;
										extra_st-=1;
										ex_st.setText(extra_st+"");
										student.tot_set++;
									}
									else if(st[imp].ci==8)
									{
										env_st-=1;
										extra_st-=1;
										ex_st.setText(extra_st+"");
										student.tot_set++;
									}
									else if(st[imp].ci==9)
									{
										tra_st-=1;
										extra_st-=1;
										ex_st.setText(extra_st+"");
										student.tot_set++;
									}
									
									
									
								}
							}
							
						}
						
			    		
		    	        
						try {
							if(st[imp].takeseat.getSelectedIndex()==0)
							{   // System.out.println("going in the seat selected");
								if(st[imp].prefsel.getSelectedIndex()==0)
								{
									//System.out.println("going in general");
									bw.write(student.tot_set+"\t\t"+st[imp].name.getText()+"\t\t"+st[imp].pref[0].getSelectedItem()+"\t\t\t    "+ st[imp].score.getText()+"\t\t\t"+st[imp].prefsel.getSelectedItem()+"\t\t\t\t"+st[imp].pref_items[st[imp].gi]+"\n");
					    	        
								}
								else
								{
									//System.out.println("going in category");
									bw.write(student.tot_set+"\t\t"+st[imp].name.getText()+"\t\t"+st[imp].pref[0].getSelectedItem()+"\t\t\t    "+ st[imp].score.getText()+"\t\t\t"+st[imp].prefsel.getSelectedItem()+"\t\t\t\t"+st[imp].pref_items[st[imp].ci]+"\n");
					    	       
								}
							}
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						if(student.tot_set==total_seats || student.tot_set==total_var_seats)
						{
							final JFrame fr=new JFrame();
							fr.setSize(230,100);
							fr.setLayout(new FlowLayout());
							Toolkit toolkit1= Toolkit.getDefaultToolkit();
							Dimension dimension = toolkit1.getScreenSize();
							int height1=(int) dimension.getHeight();
							int width1=(int) dimension.getWidth();
			                 
							fr.setLocation(width1/2, height1/2);
							fr.add(new JLabel("All the students have been alloted seats"));
							JButton kj=new JButton("Ok");
							
							fr.add(kj);
							kj.addActionListener(new ActionListener() {
								
								@Override
								public void actionPerformed(ActionEvent arg0) {
									// TODO Auto-generated method stub
								fr.dispose();	
								}
							});
							fr.setVisible(true);
							fr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						    
							
						}
						
						st[imp].lp=-1;
						//System.out.println("coming for the lock -1");
						}
					}
					}
				};
				
				
				
				
			    conl=new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						
						
						
						
						
						imp++;
						
						if(imp>=total_seats || imp>=total_var_seats)
						{
							
							final JFrame fr=new JFrame();
							fr.setSize(230,100);
							fr.setLayout(new FlowLayout());
							Toolkit toolkit1= Toolkit.getDefaultToolkit();
							Dimension dimension = toolkit1.getScreenSize();
							int height1=(int) dimension.getHeight();
							int width1=(int) dimension.getWidth();
			                 
							fr.setLocation(width1/2, height1/2);
							fr.add(new JLabel("All Students Done"));
							JButton kj=new JButton("Ok");
							
							fr.add(kj);
							kj.addActionListener(new ActionListener() {
								
								@Override
								public void actionPerformed(ActionEvent arg0) {
									// TODO Auto-generated method stub
								fr.dispose();	
								}
							});
							fr.setVisible(true);
							fr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

							
						}
						else
						{
							
							//System.out.println(arg0+"");
						//System.out.println("value of lp for "+imp +"in conl is"+st[imp].lp);
						st[imp].button.removeActionListener(conl);
						st[imp].gi=-1;
						st[imp].ci=-1;
						int bci;
						bci=st[imp].pref[0].getSelectedIndex();
						st[imp].gi=check_pref(imp);
						if(bci==0)
							st[imp].ci=st[imp].gi;
						else
							st[imp].ci=check_cat_rank(imp);
						if(st[imp].gi<0)
						{
							st[imp].lgen.setText("-");
						}
						else
						{
							st[imp].lgen.setText(st[imp].pref_items[st[imp].gi]);

						}
						if(st[imp].ci<0)
						{
							st[imp].lcat.setText("-");
						}
						else
						{
							st[imp].lcat.setText(st[imp].pref_items[st[imp].ci]);

						}
						st[imp].lockbutton.addActionListener(lockl);
						//System.out.println("value of lp for "+imp +"in conl is"+st[imp].lp);

					}
						}
				};
				
				
				rl=new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
						if(imp<=-1)
						{
							final JFrame fr=new JFrame();
							fr.setSize(100,85);
							fr.setLayout(new FlowLayout());
							Toolkit toolkit1= Toolkit.getDefaultToolkit();
							Dimension dimension = toolkit1.getScreenSize();
							int height1=(int) dimension.getHeight();
							int width1=(int) dimension.getWidth();
			                 
							fr.setLocation(width1/2, height1/2);
							fr.add(new JLabel("Cannot Reset"));
							JButton kj=new JButton("Ok");
							
							fr.add(kj);
							kj.addActionListener(new ActionListener() {
								
								@Override
								public void actionPerformed(ActionEvent arg0) {
									// TODO Auto-generated method stub
								fr.dispose();	
								}
							});
							fr.setVisible(true);
							fr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

						}
						
						else if (st[imp].lp!=-1)
						{
						final JFrame fr=new JFrame();
						fr.setSize(230,100);
						fr.setLayout(new FlowLayout());
						Toolkit toolkit1= Toolkit.getDefaultToolkit();
						Dimension dimension = toolkit1.getScreenSize();
						int height1=(int) dimension.getHeight();
						int width1=(int) dimension.getWidth();
		                 
						fr.setLocation(width1/2, height1/2);
						fr.add(new JLabel("Are you sure want to reset ?"));
						JButton kj=new JButton("Yes");
						JButton nj = new JButton("No");
						fr.add(kj);
						fr.add(nj);
						kj.addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent arg0) {
								// TODO Auto-generated method stub
							
								
								
								st[imp].lgen.setText("");
								st[imp].lcat.setText("");
								//st[imp].lp=0;
								st[imp].button.addActionListener(conl);
								imp=imp-1;
								
							fr.dispose();	
							}
						});
						
						nj.addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent e) {
								// TODO Auto-generated method stub
								fr.dispose();
							}
						});
						fr.setVisible(true);
						fr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						}

				        
						
						
						
						
					}
				};
				
			    for(int i=0;i<n;i++)
			    {
			    	c.gridy++;
		            st[i]= new student(i+1);    	
				    c.weightx=1;
				    c.weighty=1;
				    c.gridx=0;
				    
		            pane.add(st[i].label,c);
		            
				    c.weightx=3;
				    c.weighty=3;
				    c.gridx=1;
				    
		           pane.add(st[i].name,c);
		           
				    c.weightx=1;
				    c.weighty=1;
				    c.gridx=2;
				    
				    pane.add(st[i].pref[0],c);
				    
				    c.weightx=1;
				    c.weighty=1;
				    c.gridx=3;
				    
				    pane.add(st[i].score,c);

				    
				    
				    c.weightx=1;
				    c.weighty=1;
				    c.gridx=4;
				    
		            pane.add(st[i].pref[1],c);
		            
				    c.weightx=1;
				    c.weighty=1;
				    c.gridx=5;
				    
		            pane.add(st[i].pref[2],c);

				    c.weightx=1;
				    c.weighty=1;
				    c.gridx=6;
				    
		            pane.add(st[i].pref[3],c);

				    c.weightx=1;
				    c.weighty=1;
				    c.gridx=7;
				    
		            pane.add(st[i].pref[4],c);
		            
				    c.weightx=1;
				    c.weighty=1;
				    c.gridx=8;
				    
		            pane.add(st[i].pref[5],c);

				    c.weightx=1;
				    c.weighty=1;
				    c.gridx=9;
				    
		            pane.add(st[i].button,c);
		            st[i].button.addActionListener(conl);
		            
		            
		            c.gridx++;
		            pane.add(st[i].reset,c);
		            st[i].reset.addActionListener(rl);
		            
		            c.gridx++;
		            pane.add(st[i].lgen,c);
		            
		            c.gridx++;
		            pane.add(st[i].lcat,c);
		            
		            c.gridx++;
		            pane.add(st[i].prefsel,c);
		            
		            c.gridx++;
		            pane.add(st[i].takeseat,c);
		            
		            c.gridx++;
		            pane.add(st[i].lockbutton,c);
		            
		            
		            st[i].lp=0;
			    }
	    
			    c.weightx=1;
			    c.weighty=1;
			    c.gridx=4;
			    c.gridy+=3;
			    setFocusable(true);
		       pane.add(finb,c);
                finb.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						try {
							bw.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				});//pane.setFocusable(true);
			    
			} }
        }
		});
        //pane.setFocusable(true);
	    
	}
	static int n,imp;
    static sdata[] studata;
    static ActionListener conl,lockl,rl;
     final static student[] st= new student[1000];
    static int check_pref(int i)
	{
		int j,t=-1;
		for(j=1;j<5;j++)
		{
			t=st[i].pref[j].getSelectedIndex();
			if(t==0 )
			{
				if(struc_gen==0 && extra_gen>0)
				{
					t=5;break;

				}
				else if(struc_gen>0)
				{
					break;
				}
			}
			else if(t==1)
			{
				if(hy_gen==0 && extra_gen>0)
				{
					t=6;break;
				}
				else if(hy_gen>0)
					break;
			}
			else if(t==2)
			{
				if(geo_gen==0 && extra_gen>0)
				{
					t=7;break;
				}
				else if(geo_gen>0)
				{
					break;
				}
			}
			else if(t==3 )
			{
				if(env_gen==0 && extra_gen>0)
				{
					t=8;break;
				}
				else if(env_gen>0)
					break;
			}
			else if(t==4)
			{
				if(tra_gen==0 && extra_gen>0)
				{
					t=9;break;
				}
				else if(tra_gen>0)
					break;
			}
			else 
			{
				t=-1;
			}
		
		}
		return t;
	}
    
    

    
    static int check_cat_rank(int i)
	{
		int j,t=-1,ci;
		ci=st[i].pref[0].getSelectedIndex();
		if(ci==1)
		{
			for(j=1;j<5;j++)
			{
				t=st[i].pref[j].getSelectedIndex();
				if(t==0 )
				{
					if(struc_obc==0 && extra_obc>0)
					{
						t=5;break;

					}
					else if(struc_obc>0)
					{
						break;
					}
				}
				else if(t==1)
				{
					if(hy_obc==0 && extra_obc>0)
					{
						t=6;break;
					}
					else if(hy_obc>0)
						break;
				}
				else if(t==2)
				{
					if(geo_obc==0 && extra_obc>0)
					{
						t=7;break;
					}
					else if(geo_obc>0)
					{
						break;
					}
				}
				else if(t==3 )
				{
					if(env_obc==0 && extra_obc>0)
					{
						t=8;break;
					}
					else if(env_obc>0)
						break;
				}
				else if(t==4)
				{
					if(tra_obc==0 && extra_obc>0)
					{
						t=9;break;
					}
					else if(tra_obc>0)
						break;
				}
				else 
				{
					t=-1;
				}
			
			
			}

		}
		else if(ci==2)
		{
			for(j=1;j<5;j++)
			{
				t=st[i].pref[j].getSelectedIndex();
				if(t==0 )
				{
					if(struc_sc==0 && extra_sc>0)
					{
						t=5;break;

					}
					else if(struc_sc>0)
					{
						break;
					}
				}
				else if(t==1)
				{
					if(hy_sc==0 && extra_sc>0)
					{
						t=6;break;
					}
					else if(hy_sc>0)
						break;
				}
				else if(t==2)
				{
					if(geo_sc==0 && extra_sc>0)
					{
						t=7;break;
					}
					else if(geo_sc>0)
					{
						break;
					}
				}
				else if(t==3 )
				{
					if(env_sc==0 && extra_sc>0)
					{
						t=8;break;
					}
					else if(env_sc>0)
						break;
				}
				else if(t==4)
				{
					if(tra_sc==0 && extra_sc>0)
					{
						t=9;break;
					}
					else if(tra_sc>0)
						break;
				}
				else 
				{
					t=-1;
				}
			
			
			}

		}
		else if(ci==3)
		{
			for(j=1;j<5;j++)
			{
				t=st[i].pref[j].getSelectedIndex();
				if(t==0 )
				{
					if(struc_st==0 && extra_st>0)
					{
						t=5;break;

					}
					else if(struc_st>0)
					{
						break;
					}
				}
				else if(t==1)
				{
					if(hy_st==0 && extra_st>0)
					{
						t=6;break;
					}
					else if(hy_st>0)
						break;
				}
				else if(t==2)
				{
					if(geo_st==0 && extra_st>0)
					{
						t=7;break;
					}
					else if(geo_st>0)
					{
						break;
					}
				}
				else if(t==3 )
				{
					if(env_st==0 && extra_st>0)
					{
						t=8;break;
					}
					else if(env_st>0)
						break;
				}
				else if(t==4)
				{
					if(tra_st==0 && extra_st>0)
					{
						t=9;break;
					}
					else if(tra_st>0)
						break;
				}
				else 
				{
					t=-1;
				}
			
			
			}
		}
		
		return t;
	}
	
}



class student extends JPanel 
{
	public student(int s)
	{
		lp=0;
		
	      label = new JLabel(s + "");
	      lgen= new JLabel();
	      lcat = new JLabel();
	      pref=new JComboBox[6]; 
	      pref[0]=new JComboBox(cat_items);
	      for(int i=1;i<=5;i++)
	      {
	    	 pref[i]= new JComboBox(pref_item);
	      }
	      prefsel = new  JComboBox(prefselstring);
	      takeseat= new JComboBox(takeseatstring);
	       name = new JTextField(30);
	       score= new JTextField(5);
	       button= new JButton("ok");
	       lockbutton= new JButton("Lock");
	       reset= new JButton("Reset");
	      
	}
	 String[] cat_items = {"GEN","OBC","SC","ST"};
	 String[] pref_item={"Structural","Hydraulics","Geotechnical","Environmental","Transportation"};
	 String[] pref_items= {"Structural","Hydraulics","Geotechnical","Environmental","Transportation","Structural","Hydraulics","Geotechnical","Environmental","Transportation"};
	 String[] prefselstring={"GENERAL","CATEGORY"};
	 String[] takeseatstring={"YES","NO"};
	JComboBox pref[],prefsel,takeseat;
	JTextField name;
	JTextField score;
	JLabel label,lgen,lcat;
	JButton button,lockbutton,reset;
	int gi,ci,lp;
	static int tot_set=0;

}




class sdata
{
	public sdata()
	{
		pref=new int[6];
		name=new String();
	}
	String name;
	int cat,gscore;
	int pref[];
}


