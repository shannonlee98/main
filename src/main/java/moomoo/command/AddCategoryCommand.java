package moomoo.command;

import moomoo.task.*;

public class AddCategoryCommand extends Command {

    private String categoryName;

    public AddCategoryCommand(boolean isExit, String input, String categoryName) {
        super(isExit, input);
        this.categoryName = categoryName;
    }

    @Override
    public void execute(ScheduleList calendar, Budget budget, CategoryList categoryList, TransactionList transList, Ui ui, Storage storage)
            throws MooMooException {
        super.execute(calendar, budget, categoryList, transList, ui, storage);

        Category newCategory = new Category(categoryName);
        categoryList.add(newCategory);
        ui.showNewCategoryMessage(categoryName);
    }
}
