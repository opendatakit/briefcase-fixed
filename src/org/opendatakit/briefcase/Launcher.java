package org.opendatakit.briefcase;

import static org.opendatakit.briefcase.operations.Export.EXPORT_FORM;
import static org.opendatakit.briefcase.operations.ImportFromODK.IMPORT_FROM_ODK;
import static org.opendatakit.briefcase.operations.PullFormFromAggregate.PULL_FORM_FROM_AGGREGATE;

import org.opendatakit.briefcase.ui.MainBriefcaseWindow;
import org.opendatakit.common.cli.Cli;

public class Launcher {
  public static void main(String[] args) {
    new Cli()
        .register(PULL_FORM_FROM_AGGREGATE)
        .register(IMPORT_FROM_ODK)
        .register(EXPORT_FORM)
        .otherwise(MainBriefcaseWindow::launchGUI)
        .run(args);
  }
}
