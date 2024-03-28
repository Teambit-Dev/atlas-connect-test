package lt.teambit.cloud.jira.plugins.integration.issue.model;

public class Issue {
    private String key;
    private String id;
    private String self;
    private IssueFields fields;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    public IssueFields getFields() {
        return fields;
    }

    public void setFields(IssueFields fields) {
        this.fields = fields;
    }


    @Override
    public String toString() {
        return "Issue{" +
                "key='" + key + '\'' +
                ", id='" + id + '\'' +
                ", self='" + self + '\'' +
                ", fields=" + fields +
                '}';
    }
}
