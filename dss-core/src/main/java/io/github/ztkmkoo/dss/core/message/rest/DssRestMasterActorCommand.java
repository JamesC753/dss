package io.github.ztkmkoo.dss.core.message.rest;

import akka.actor.typed.ActorRef;
import io.github.ztkmkoo.dss.core.message.DssCommand;

/**
 * Project: dss
 * Created by: @ztkmkoo(ztkmkoo@gmail.com)
 * Date: 20. 3. 3. 오후 10:02
 */
public interface DssRestMasterActorCommand extends DssCommand {

    ActorRef<DssRestChannelHandlerCommand> getSender();
}
