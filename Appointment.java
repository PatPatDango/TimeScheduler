import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
public class Appointment 
{
    private String name;
    private Date date;
    private String location;
    private String duration;
    private String participants;
    private String attachementfiles;
    private String priority;
    private int reminder;
    
    public String getName() {return name;}
    public Date getDate() {return date;}
    public String getDuration() {return duration;}
    public String getLocation() {return location;}
    public String getParticipants() {return participants;}
    public String getAttachmentfiles() {return attachementfiles;}
    public String getPriority() {return priority;}
    public int getReminder() {return reminder;}
    
    public void setName(String _name) {name=_name;}
    public void setDate(Date _date) {date=_date;}
    public void setDuration(String _duration) {duration=_duration;}
    public void setLocation(String _location) {location=_location;}
    public void setParticipants(String _participants) {participants=_participants;}
    public void setAttachementfiles(String _attachementfiles) {attachementfiles=_attachementfiles;}
    public void setPriority(String _priority) {priority=_priority;}
    public void setReminder(int _reminder) {reminder=_reminder;}
    
    public static void main(String args[])
    {
        add_button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                Appointment appointment = new Appointment();
                appointment.setName(eventname.getText());
                appointment.setDate(eventdate.getText());
                appointment.setDuration(eventsduration.getText());
                appointment.setLocation(eventlocation.getText());
                appointment.setParticipants(eventparticipants.getText());
                appointment.setAttachementfiles(~~.getText());
                appointment.setPriority(eventpriority.getText());
                appointment.setReminder(~~.getText());
            }
        });
    }
}
