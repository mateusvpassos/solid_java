package br.com.mateus.solid.endpoint.model;

public enum Role {
    ASSISTANT {
        @Override
        public Role nextRole() {
            return ANALYST;
        }
    },
    ANALYST {
        @Override
        public Role nextRole() {
            return SPECIALIST;
        }
    },
    SPECIALIST {
        @Override
        public Role nextRole() {
            return MANAGER;
        }
    },
    MANAGER {
        @Override
        public Role nextRole() {
            return MANAGER;
        }
    };

    public abstract Role nextRole();
}
