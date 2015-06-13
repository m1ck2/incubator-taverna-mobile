package org.apache.taverna.mobile.tavernamobile;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import org.apache.taverna.mobile.R;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by root on 6/8/15.
 */
public class Workflow {
    private Context context;
    private String workflow_author;
    private String workflow_title;
    private String workflow_description;
    private String workflow_datecreated, workflow_datemodified;
    private Bitmap workflow_author_bitmap;
    private WorkflowComponent workflowComponent;
    private String workflow_remote_url;
    private List<Runs> workflow_runs;
    private int workflow_input;
    private long id;

    public static enum workflow_input_type{ TYPE_INT, TYPE_STRING, TYPE_OBJECT};

    public Workflow(Context ctx, String title, String author, String description, long id, String url){
        this.context = ctx;
        this.workflow_author = author;
        this.workflow_author_bitmap = BitmapFactory.decodeResource(this.context.getResources(), R.drawable.ic_userprofile);
        this.workflow_description =description;
        this.workflow_title =title;
        this.workflow_input=1;
        this.id = id;
        this.workflow_remote_url = url;
        this.workflow_runs = new ArrayList<Runs>();
        this.setWorkflow_datecreated(SimpleDateFormat.getDateTimeInstance().format(new Date()));
        this.setWorkflow_datemodified(SimpleDateFormat.getDateTimeInstance().format(new Date()));
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getWorkflow_datecreated() {
        return this.workflow_datecreated;
    }

    public String getWorkflow_remote_url() {
        return this.workflow_remote_url;
    }

    public void setWorkflow_remote_url(String workflow_remote_url) {
        this.workflow_remote_url = workflow_remote_url;
    }

    public void setWorkflow_datecreated(String workflow_datecreated) {
        this.workflow_datecreated = workflow_datecreated;
    }

    public String getWorkflow_datemodified() {
        return this.workflow_datemodified;
    }

    public void setWorkflow_datemodified(String workflow_datemodified) {
        this.workflow_datemodified = workflow_datemodified;
    }

    public List<Runs> getWorkflow_runs() {
        return this.workflow_runs;
    }

    public void setWorkflow_runs(List<Runs> workflow_runs) {
        this.workflow_runs = workflow_runs;
    }

    public int getWorkflow_input() {
        return this.workflow_input;
    }

    public void setWorkflow_input(int workflow_input) {
        this.workflow_input = workflow_input;
    }

    public workflow_input_type getInputType(){
        return workflow_input_type.TYPE_INT;
    }

    public String getWorkflow_author() {
        return this.workflow_author;
    }

    public String getWorkflow_description() {
        return this.workflow_description;
    }

    public String getWorkflow_title() {
        return this.workflow_title;
    }

    public Bitmap getWorkflow_author_bitmap() {
        return this.workflow_author_bitmap;
    }

    public WorkflowComponent getWorkflowComponent() {
        return this.workflowComponent;
    }

    public void setWorkflow_author(String workflow_author) {
        this.workflow_author = workflow_author;
    }

    public void setWorkflow_title(String workflow_title) {
        this.workflow_title = workflow_title;
    }

    public void setWorkflow_description(String workflow_description) {
        this.workflow_description = workflow_description;
    }

    public void setWorkflow_author_bitmap(Bitmap workflow_author_bitmap) {
        this.workflow_author_bitmap = workflow_author_bitmap;
    }

    public void setWorkflowComponent(WorkflowComponent workflowComponent) {
        this.workflowComponent = workflowComponent;
    }
}
