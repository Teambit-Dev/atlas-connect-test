package lt.teambit.cloud.jira.plugins.integration.issue.model;

import java.util.List;

public class Changelog {
    private List<ChangeLogItem> items;

    private int id;

    public List<ChangeLogItem> getItems() {
        return items;
    }

    public void setItems(List<ChangeLogItem> items) {
        this.items = items;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
