package org.phoenixframework.channels

enum class ChannelEvent constructor(val phxEvent: String) {
    CLOSE("phx_close"),
    ERROR("phx_error"),
    JOIN("phx_join"),
    REPLY("phx_reply"),
    LEAVE("phx_leave");

    companion object {

        fun getEvent(phxEvent: String): ChannelEvent? {
            for (ev in values()) {
                if (ev.phxEvent == phxEvent) {
                    return ev
                }
            }
            return null
        }
    }
}
