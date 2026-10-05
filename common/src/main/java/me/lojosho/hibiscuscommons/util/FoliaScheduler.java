package me.lojosho.hibiscuscommons.util;

import me.lojosho.hibiscuscommons.HibiscusCommonsPlugin;
import org.bukkit.entity.Entity;

public final class FoliaScheduler {
    private FoliaScheduler() {}

    public static void runEntityTaskLater(Entity entity, Runnable task, long delayTicks) {
        if (entity != null) HibiscusCommonsPlugin.getInstance().getTaskScheduler()
                .runTaskLater(entity, task, Math.max(1, delayTicks));
    }
}
